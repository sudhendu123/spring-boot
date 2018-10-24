package com.prac.blocking.queue.priority;

import java.util.concurrent.BlockingQueue;

public class PriorityBlockingQueueConsumer implements Runnable {

	protected BlockingQueue<String> blockingQueue;

	public PriorityBlockingQueueConsumer(BlockingQueue<String> queue) {
		this.blockingQueue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String data = blockingQueue.take();
				System.out.println(Thread.currentThread().getName()
						+ " take(): " + data);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
