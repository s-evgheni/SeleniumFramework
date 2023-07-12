In order to use Selenium you will need to download related drivers specific to the platform on which you will be running those tests.
(also see: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors/driver_location/)

In my case the platform is MacOS based on ARM processor so all drivers

Firefox Drivers location:
https://github.com/mozilla/geckodriver/releases

Chrome Drivers location for M1:
NOTE: MUST MATCH Currently INSTALLED browser version, which is 114.0.x in my case
https://chromedriver.storage.googleapis.com/114.0.5735.16/chromedriver_mac_arm64.zip

Chrome Drivers location for the rest:
http://chromedriver.storage.googleapis.com/index.html

NOTE:
MacOS blocks executable binaries downloaded from the internet.
In order to allow it you might need to CMD+CLICK on the file before runnign this program to add appropriate permissions.

