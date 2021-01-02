# Android Connectivity Remote Test 

How  to setup & run Appium UI Tests on the remote connectivity app 

-------------------------------------------
**Prerequisites:**
- Download Appium driver 
- Also, setup android related dependencies. 
-adb set up,java home set up ,Maven set up 
```appium-doctor --android```

**Setting up Project to execute**
- Clone the repo
- Edit below fields in the file `/src/main/resources/config.json`

    - platform Name 
    - platform Version
    - copy app file location (absolute path)

**Steps To Run Test:**
- Navigate to project directory
- Start appium server by command
```appium```
- Execute test with "WeatherTest Runner class"
