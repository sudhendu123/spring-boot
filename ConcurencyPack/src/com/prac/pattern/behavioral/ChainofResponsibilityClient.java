package com.prac.pattern.behavioral;

public class ChainofResponsibilityClient {
	
	private static Logger doChaining() {

		Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);
		Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
		Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
		
		errorLogger.setNextLevelLogger(debugLogger);
		consoleLogger.setNextLevelLogger(errorLogger);

		return consoleLogger;
	}

	public static void main(String args[]) {
		Logger chainLogger = doChaining();

		chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is compeled");
		System.out.println("---------------------------------------");
		chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");
		System.out.println("---------------------------------------");
		chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");
		

	}
}

abstract class Logger {
	public static int OUTPUTINFO = 1;
	public static int ERRORINFO = 2;
	public static int DEBUGINFO = 3;
	protected int levels;
	protected Logger nextLevelLogger;

	public void setNextLevelLogger(Logger nextLevelLogger) {
		this.nextLevelLogger = nextLevelLogger;
	}

	public void logMessage(int levels, String msg) {
		if (this.levels <= levels) {
			displayLogInfo(msg);
		}
		if (nextLevelLogger != null) {
			nextLevelLogger.logMessage(levels, msg);
		}
	}

	protected abstract void displayLogInfo(String msg);
}

class ConsoleBasedLogger extends Logger {
	public ConsoleBasedLogger(int levels) {
		this.levels = levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("CONSOLE LOGGER INFO: " + msg);
	}
}

class DebugBasedLogger extends Logger {
	public DebugBasedLogger(int levels) {
		this.levels = levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("DEBUG LOGGER INFO: " + msg);
	}
}// End of the DebugBasedLogger class.

class ErrorBasedLogger extends Logger {
	public ErrorBasedLogger(int levels) {
		this.levels = levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("ERROR LOGGER INFO: " + msg);
	}
}
