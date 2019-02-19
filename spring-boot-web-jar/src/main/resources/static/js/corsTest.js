$(document).ready(function() {
	$.ajax({
		//url: "http://localhost:8080/data"
		url: "http://localhost:8585/ApplicationResources_en_US.json"
	}).then(function(data) {
	  var items = [];
	  $.each( data, function( key, val ) {
		  
		//items.push("Id: "+page.title +", Name: "+label.username+"<br/>");
		items.push("val: "+val);
	  });
          $('.result').append(items);
	});
}); 