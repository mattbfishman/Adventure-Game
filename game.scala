//Matt Fishman
def gamestart: Unit = {
	println("Welcome to the start of Doofenshmirtz!")
	println("For help print out H!") }
//This function introduces the game
def roomone: Unit = {
	println("You are in Room 1!")	
	println("What direction would you like to go(N,W)? 	")
	val response = readLine
		if(response.toUpperCase == "N"){
			time
			roomfour}
		else if(response.toUpperCase == "S"){
			println("You cannot go that way")
			roomone			
			}
		else if(response.toUpperCase == "E"){
			println("You cannot go that way")
			roomone
			}		
		else if(response.toUpperCase == "W"){
			time
			roomnine			
			}		
		else if(response.toUpperCase == "H"){
			help
			roomone			
			}		
		else	{
			println("Command not found")	
			roomone			
			}
}
//the function above and down below has the user prompted which direction he wants to go
//if he types in N,W,S, or E he we be either taken to another room or told he cannot go that way
//if types out an H at any time of the game the game will print out instructions to play that game.
//anything not recognized by the function will print out command not found.
def roomfour: Unit = {
	println("You are in Room 4!")
	println("What direction would you like to go(S,E)?	")
	val response = readLine
		if(response.toUpperCase == "E"){
			time
			roomfive}
		else if(response.toUpperCase == "S"){
			time
			roomone
			}
		else if(response.toUpperCase == "N"){
			println("You cannot go that way")
			roomfour
			}		
		else if(response.toUpperCase == "W"){
			println("You cannot go that way")
			roomfour
			}		
		else if(response.toUpperCase == "H"){
			help
			roomfour		
			}		
		else	{
			println("Command not found")	
			roomfour			
			}
}
//same thing as before comment used as break to see through code easier

def roomfive: Unit = {
	println("You are in Room 5!")
	parttwo	
	println("What direction would you like to go(S,E,W)?	")
	val response = readLine
		if(response.toUpperCase == "E"){
			time			
			roomsix}
		else if(response.toUpperCase == "S"){
			time
			roomtwo
			}
		else if(response.toUpperCase == "N"){
			println("You cannot go that way")
			roomfive
			}		
		else if(response.toUpperCase == "W"){
			time			
			roomfour
			}		
		else if(response.toUpperCase == "H"){
			help
			roomfive		
			}		
		else	{
			println("Command not found")	
			roomfive			
			}
		
}
//break room 5
//room five has the second part which to get you need to get the first part

def roomsix: Unit = {
	println("You are in Room 6!")
	println("What direction would you like to go(S,W)?	")
	val response = readLine	
		if(response.toUpperCase == "E"){
			println("You cannot go that way")			
			roomsix}
		else if(response.toUpperCase == "S"){
			time			
			roomten
			}
		else if(response.toUpperCase == "N"){
			println("You cannot go that way")
			roomsix
			}		
		else if(response.toUpperCase == "W"){
			time			
			roomfive
			}		
		else if(response.toUpperCase == "H"){
			help
			roomsix		
			}		
		else	{
			println("Command not found")	
			roomsix			
			}
}
//break room 6

def roomtwo: Unit = {
	println("You are in Room 2!")
	partthree	
	println("What direction would you like to go(N,S,E)?	")
	val response = readLine	
		if(response.toUpperCase == "E"){
			time			
			roomten
			}		
		else if(response.toUpperCase == "S"){
			time			
			roomeight
			}
		else if(response.toUpperCase == "N"){
			time			
			roomfive
			}		
		else if(response.toUpperCase == "W"){
			println("You cannot go that way")
			roomtwo
			}		
		else if(response.toUpperCase == "H"){
			help
			roomtwo		
			}		
		else	{
			println("Command not found")	
			roomtwo		
			}
}
//break room 2
//room 2 has the third part in it

def roomten: Unit = {
	println("You are in Room 10!")
	println("Welcome to the Workshop!")
	workshop
}
//break room 10 above
//last room in the game calls to the workshop function to see if you can end the game

def roomeight: Unit = {
	println("You are in Room 8!")
	println("What direction would you like to go(N,W)?	")
	val response = readLine	
		if(response.toUpperCase == "E"){
			println("You cannot go that way")
			roomeight
			}		
		else if(response.toUpperCase == "S"){
			println("You cannot go that way")
			roomeight
			}
		else if(response.toUpperCase == "N"){
			time			
			roomtwo
			}		
		else if(response.toUpperCase == "W"){
			time
			roomseven
			}		
		else if(response.toUpperCase == "H"){
			help
			roomeight	
			}		
		else	{
			println("Command not found")	
			roomeight	
			}
}
//break room 8

def roomseven: Unit = {
	println("You are in Room 7!")
	partfour	
	println("What direction would you like to go(N,E)?	")
	val response = readLine	
		if(response.toUpperCase == "E"){
			time			
			roomeight
			}		
		else if(response.toUpperCase == "S"){
			println("You cannot go that way")
			roomseven
			}
		else if(response.toUpperCase == "N"){
			time			
			roomnine
			}		
		else if(response.toUpperCase == "W"){
			println("You cannot go that way")
			roomseven
			}		
		else if(response.toUpperCase == "H"){
			help
			roomseven	
			}		
		else	{
			println("Command not found")	
			roomseven	
			}
}
//break room 7
//room 7 has part four in it(works like all other parts)

def roomnine: Unit = {
	println("Welcome to Room 9!")
	println("What direction would you like to go(N,S,E)?	")
	val response = readLine	
		if(response.toUpperCase == "E"){
			time			
			roomone
			}		
		else if(response.toUpperCase == "S"){
			time
			roomseven
			}
		else if(response.toUpperCase == "N"){
			time
			roomthree
			}		
		else if(response.toUpperCase == "W"){
			println("You cannot go that way")
			roomnine
			}		
		else if(response.toUpperCase == "H"){
			help
			roomnine	
			}		
		else	{
			println("Command not found")	
			roomnine	
			}
}
//break room 9 

def roomthree: Unit = {
	println("Welcome to Room 3!")
	partone	
	println("What direction would you like to go(S)?	")	
	val response = readLine	
		if(response.toUpperCase == "E"){
			println("You cannot go that way")
			roomthree			
			}		
		else if(response.toUpperCase == "S"){
			time			
			roomnine
			}
		else if(response.toUpperCase == "N"){
			println("You cannot go that way")
			roomthree
			}		
		else if(response.toUpperCase == "W"){
			println("You cannot go that way")
			roomthree
			}		
		else if(response.toUpperCase == "H"){
			help
			roomthree	
			}		
		else	{
			println("Command not found")	
			roomthree	
			}
}
//break room 3
//room 3 has part 1
//first part allows you to get the second part	
def help: Unit = {
	println("Welcome to the help menu!")
	println("To play the game type in the characters prompted to you.")
	println("Find the all the parts in order and bring them to the workshop.")
	println("Beat the game before the time is up!")
	
}
// when a user types in "H" it will call to the help function which explains how to play to the user
//break
def partone: Unit = {
	if (part == 1){
		println("You have recieved Part 1!")
		part = part + 1}	
	else {
		println("You already have Part 1")}
}
def parttwo: Unit = { 	
	if (part == 2){
		println("You have recieved Part 2!")
		part = part + 1}	
	else if (part >= 2){
		println("You already have Part 2!")}	
	else{
		println("This part cannot be collected yet!")}
}
//you need an if for if it is greater then 2 saying you already collected that part
def partthree: Unit = {
	if (part ==3){
		println("You have recieved Part 3!")
		part = part + 1}
	else if (part == 1){
		println("This part cannot be collected yet!")
		}
	else if (part >= 3 ){
		println("You have already recieved Part 3!")
		}
	else if (part == 2){
		println("This part cannot be collected yet!")}
	
}
def partfour: Unit = {
	if (part == 4){
		println("You have recieved Part 4!")
		part = part + 1}
	else if (part ==1 ){
		println("This part cannot be collected yet!")
		}
	else if(part == 2){
		println("This part cannot be collected yet!")
		}
	else if(part == 3){
		println("This part cannot be collected yet!")
		}
	else if(part >= 4) {
		println("You have already recieved Part 4, head to the Workshop(Room 10)!")
		}
}
//the parts work so that when you get the first part it changes the value of the variable part to add 1.
// then when you try to get the next part it checks what the value or variable part is
//depending on what it is it ca tell you whether you need a previous part, already have the part or you recieve the part.
def workshop: Unit = {
	if (part == 5){
		println("You build the device!")
		println("Heinz has won the game!")
		println("Would you like to play again?")
		val response = readLine
		if (response.toUpperCase == "YES"){
			gamestart
			roomone}
		else{
		println("Goodbye!")
		}}
	else{
		println("Come here after you collect all the parts!")
		direction
		}
}
//The workshop checks the value of part variable and let you know whether you won the game and then prompts you if you wanan play again.
//if the part value is too low it tells you to come back when you recieved all the parts.
def direction: Unit = {	
	println("What direction would you like to go(N,W)!	")
		val response = readLine
		if(response.toUpperCase == "N"){
			time			
			roomsix
			}		
		else if(response.toUpperCase == "S"){
			println("You cannot go that way")
				direction		
			}
		else if(response.toUpperCase == "W"){
			time			
			roomtwo
			}		
		else if(response.toUpperCase == "E"){
			println("You cannot go that way")
			direction
			}		
		else if(response.toUpperCase == "H"){
			help
			direction	
			}		
		else	{
			println("Command not found")	
			direction	
			}
}
//direction function is used to for the workshop function to work correctly. It's so you don't remain in the workshop room.
def time: Unit = {
	if (t > 5){
	if (part == 5){
		t = 5
	println("Perry has cut your time!")	
	print(t) 
	println(" Minutes remaining")
	}else{
		t = t - 1
	print(t) 
	println(" Minutes remaining")}
	}else if (t <= 5){
	t = t - 1
	print(t) 
	println(" Minutes remaining")}
	else if (t == 0){
	loss}
}		
//time is the games time limit. It minuses one minute everytime you leave a room
//you have a vaiable called t = 20 so you have 20 minutes to beat the game
//when you have all the parts the time is cut to 5 minuts automatically
def loss: Unit = {
	println("Heinz failed you lose the game!")
	println("Would you like to play again?")
	val response = readLine
	if (response.toUpperCase == "YES"){
			gamestart
			roomone}
		else{
		println("Goodbye!")
		}
}
//loss prints out if you run out of time and lost the game
//it will prompt you if you want to quit the game or try again
var part = 1
var t =20
//t = time
gamestart
roomone