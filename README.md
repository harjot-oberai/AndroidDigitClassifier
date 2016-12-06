# AndroidDigitClassifier
Android digit classifier that works with a python http server

# Steps to get it working
1. Clone the repo, import project in android studio, build and run on your phone or emulator.
2. Open `pythonScripts` folder and run `server.py` by using command `python server.py PORT_NUMBER`. Replace `PORT_NUMBER` by some feasible port number, say `8800`.
3. run `ngrok.exe` and use command `ngrok http PORT_NUMBER`. Replace `PORT_NUMBER` by same port number used in step 2.
4. Inside the app set URL same as the one you receive in step 3, something like `http://abcdefgh.ngrok.io`.
5. Capture an Image using the `SELECT` button, and then use `SEND` button to send the image as a `POST` request to the python server and receive final image as a `GET` request.

# Schematic Diagram

                       POST image                     Forward                        Forward
      `Andoroid App` -------------> `ngrok server` -------------> `python server` -------------> `perform recognition`
             ^                          |     ^                       |     ^                             |
             |__________________________|     |_______________________|     |_____________________________|
                      GET image                         Forward                      Write final image

# Screens

## python server
 ![python_server](/screenshots/python_server.PNG)
 
## ngrok server
 ![ngrok_server](/screenshots/ngrok_server.PNG)
 
## App
 <img src = "/screenshots/app_1.jpg" width = "200"> --SELECT-->
 <img src = "/screenshots/app_2.jpg" width = "200"> --SEND-->
 <img src = "/screenshots/app_3.jpg" width = "200">
 
 
