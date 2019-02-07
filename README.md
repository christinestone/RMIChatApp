# RMIChatSystemAPI
A client server chat application using Java Remote Method Invocation with a Graphical User Interface and Text interface (console).

There are three Java Projects associated with this application in total, each stored in a separate repo:
- RMIChatSystemAPI
	- contains both client and server interfaces
- RMIChatSystemServer (submodule of RMIChatSystemAPI)
	- this implements the RMI server
- RMIChatSystemClient (submodule of RMIChatSystemAPI)
	- all client code for GUI and console application
	
Instructions
1. launch server (main method: StartChatServer.java)
2. start a client (main method: StartChatClient.java)
   - join chat by inputting unique username
3. repeat 2 to add additional users
