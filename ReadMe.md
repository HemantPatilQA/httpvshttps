	1. Open a command prompt and execute following command to check current Java location
	echo %JAVA_HOME%
	=> C:\Program Files\Java\jdk-11.0.13
	2. Open the windows explorer and navigate to JAVA_HOME\bin folder
	3. Run below command to generate a self signed certificate
	   keytool -genKey -alias demokey -keystore C:\Users\Heman\IdeaProjects\httpvshttps\src\main\resources\certificate\demokeystore -keyalg RSA
     It will ask to set a password for your keystore and some basic details
  	 This will generate a keystore file wirth name demokeystore at location  C:\Users\Heman\IdeaProjects\httpvshttps\src\main\resources\certificate
	4. In the Sprint Boot project having microservices hosted at http add application.yml with following details
	server:
	  ssl:
	    key-store: C:\Users\Heman\IdeaProjects\httpvshttps\src\main\resources\certificate\demokeystore
	    key-store-password: Test1234
	    key-alias: demokey
	  port: 8443
	
	5. Start the ServiceApplication and access the endpoint using https and port as 8443
     If message "Your connection isn't private" message is received click on "Advanced" and then "Proceed to ....." link
