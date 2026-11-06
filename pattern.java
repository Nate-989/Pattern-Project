//Nathan Samuel
// This is a collection of methods that create various patterns using loops
// Primarily this is to practise the use of loops for the AP exam
public class pattern {
    
public static void main(String[]args){

    stars(7);
    triangle(8);
    odds(9);
    eo(6);
    pyramid(7);
}
//PreCondition: positive number and integer input
// PostCondition: Prints * for row times, with each row having two more than the previous
public static void stars(int rows){
 
String star = "*";
while(rows > 0){
System.out.println(star);
star += "**";
rows-=1;
}}
//PreCondition: positive number and integer input
// PostCondition: Prints numbers ranging from 1 to rows, with the number of numbers increasing each row For exmaple, second row has two numbers twos
public static void triangle(int rows){
int i = 0;
int count = 1;
    int numForTriangleRows = 1;
while(i<rows){
    while(count>0){
    System.out.print(numForTriangleRows);
    count--;
    }
System.out.print("\n");
count+=i+2;
numForTriangleRows++;
i++;
}}

//PreCondition: positive number and integer input being odd
// PostCondition: Prints the number of start, start amount of times, and then decreases the number of start and the amount of times it is printed by two.Stopping at 1
public static void odds(int start){
int numForOddRows = start;
int numForLimit = start;
for(int count = 0; count<numForLimit; count+=2){

for(int i = numForOddRows;i>0;i--){
System.out.print(numForOddRows);
}
System.out.print("\n");
numForOddRows-=2;
}}

//PreCondition: positive number and integer input
// PostCondition: If max E is even, the first letter is O, otherwise the letter is O.Prints Es and Os in an alternating pattern, with the number of Es and Os in a row increasing by 1 every row until max E is reached, then it decreases by 1 every row;
public static void eo(int maxE){
String Holder;
if(maxE %2 ==0){
Holder = "O";
}else{
    Holder = "E";
}
int i = 0;
int count = 1;
while(i<maxE){
    while(count>0){
    System.out.print(Holder);
    count--;
    }
System.out.print("\n");
if(Holder.equals("E")){
Holder = "O";
}else{
    Holder = "E";
}
count+=i+2;
i++;
}
int numForeoRows = maxE;
int numForLimit = maxE;
for(int counter = 0; counter<numForLimit; counter++){
for(int m = numForeoRows-1;m>0; m--){
System.out.print(Holder);
}
System.out.print("\n");
if(Holder.equals("E")){
Holder = "O";
}else{
    Holder = "E";
}
numForeoRows--;
}}
//PreCondition: positive number and integer input
// PostCondition: Prints numbers ranging from 1 to rows, in a triangle pattern achieved through spaces. The number of numbers per row decreases by two each time.
public static void pyramid(int rows){
int k = 0;
int numForOddRows = 1;
int numForLimit = 2*rows-1;
for(int count = 1; count<numForLimit; count++){

for(int space = 0; space < count-1; space++){
    System.out.print(" ");
}
    for(int i = numForLimit-k;i>0;i--){
System.out.print(numForOddRows);
}
System.out.print("\n");
k+=2;
numForOddRows++;
}}
}








