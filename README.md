 # Chess
chess uwu.
we live in a society.
## Team Name: Some Asian Kid
Team members: Johnny Zhang, Nathan Gu, Albert Yu \
Revision Date: 5/11/21



### Program Purpose: 
The purpose of the program is to display a two player chess game that takes input from a text line and selecting pieces from left clicking(You can play the game by yourself if you're lonely or just trying to experience how to defend your own moves and how to counter the counter). The program appeals to anyone who plays chess, as it provides entertainment and practice for both chess players. 



### Instructions: 
The two players will play on the same device.\
Users will be able to input moves on a text line. First, the white player will select a piece to move and then the piece selected will appear on the top right corner. Upon selecting the piece, an auto generated line of text appears in the text field on the top left corner of the GUI to prompt for a move. Only enter the position you want to move to(eg. c4). For example, typing "e4" will move the piece at it's current position to e4.



### Target User Profile: 
Our target user profile contains a range of people from avid chess players to people who wish to practice playing with another 



### Feature List: 
Scuffed chess(will add checks, checkmates, and pins if we have extra time), there's a nice looking chess board GUI and pieces. The classes use mouseListener class to allow the users to select the pieces to move. Because we used a HashMap, we don't need to implement a system to remove the piece after it is taken.WE ALSO HAVE CUSTOMIZABLE ASSETS!!! 



### Instructions: 
Download the java files and initialize the package. Also, add the .pngs and .jpg files for the chess pieces and board. Upon completeing these tasks, run the program from the board class and you will see a chess board with the pieces. If you feel the need to adjust the chess board due to a small screen, resize the GUI into a more comfortable area or position; you can also run this on a monitor. Finall,y you can move your pieces accordingly based on how your opponent moves in chess. Click on a piece and then enter just the location where you wish to move the piece. You will see what piece you selected on the top left corner. Enter your moves through the text field(Next step White Queen "e4") and have fun :).



### Class List: 
Board, Piece, ChessPanel, MyPanel, PieceImg, Pawn, Rook, Knight, Bishop, King, Queen, MapBoard



### UML: 
(will be attached with the readme)



### Team Responsibilities:
Try and stay ahead of guidelines as much as possible and make sure to complete your class(don't procrastinate please). Ask for help and help others. Make sure to share most recent version of the code on github as well so we can update the UML and readme :). Johnny will do the code's "skeleton," Albert will do graphics, and Nathan will do UML, readme and anything else that needs doing. (In the end, Nathan created a "skeleton" of all the classes but the graphics related, while Johnny writes the methods for the individual pieces(king, knight, pawn, etc..). Albert's role remained the same).



### Known Bugs/Workarounds:
Classes compile with each other now. If you select a piece but don't enter a location and press enter, the piece will delete itself. When you launch the program from board and the screen size is too small, the chess board will be too big sometimes and the pieces are out of place. We need to add the isLegal method for each of the classes to check whether or not you can move the piece to a certain position. We are having trouble trying to link up the classes with the isLegal method due to the removal of the Square class.



### Key learnings: 
JPanel/JFrame usage, arrays, mouse input, constructors, conditions, strings, relationship between classes, UML creation, how to collaborate well.



### Credit List: 
https://codereview.stackexchange.com/questions/71790/  , Albert's father, Nathan's father.

  
