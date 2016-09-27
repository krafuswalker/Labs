var cartName = []; 
var cartPrice = [];
var name;
var price;
var i;

$(document).ready(function() {
	
	 $(".add-button1").click(function(event) {
		    var row = $(this).parent();
			var price = row.children(".price").text();
			var name = row.children(".name").text();
			cartPrice.push(price);
			cartName.push(name);
	});
 
 $(".add-button2").click(function(event) {
	 	var row = $(this).parent();
		var price = row.children(".price").text();
		var name = row.children(".name").text();
		cartPrice.push(price);
		cartName.push(name);
		
});
 $(".add-button3").click(function(event) {
	 	var row = $(this).parent();
		var price = row.children(".price").text();
		var name = row.children(".name").text();
		cartPrice.push(price);
		cartName.push(name);
		
		
});
 $("#finish").click(function(event) {
	 for (var i = 0; i < cartName.length; i++){
		console.log("Name: ", cartName[i]);
		console.log("Price: ", cartPrice[i]);
		
	 }	
	 });
});

		
