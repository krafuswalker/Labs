var cart1 = []; 
var cart2 = [];
var name;
var price;
$(document).ready(function() {
	
 $(".add-button1").click(function(event) {
	 cart1 = cart1 + 1;
	 	
	var name = " ";
	});
 
 $(".add-button2").click(function(event) {
		var row = $(this).parent();
		var price = row.children(".price");
		cart.push(price);
		console.log("the button:", this);
		console.log("Array contents: ", cart[0]);
		console.log("ROW VALUE IS: ", row);
});
 $(".add-button3").click(function(event) {
		var row = $(this).parent();
		var price = row.children(".price");
		cart.push(price);
		console.log("the button:", this);
		console.log("Array contents: ", cart[0]);
		console.log("ROW VALUE IS: ", row);
});
for (i in cart) {console.log("Array contents: ", cart[i]);}
})