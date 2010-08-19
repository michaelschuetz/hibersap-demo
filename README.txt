
Accessing SAP system with Hibersap/JCo
######################################

Hibersap simplifies use of JCo by providing handy set of annotations. Sample code uses default SAP fligth demo application.

htpp://hibersap.org


Get started:
* Make sure Maven2 or above is installed on your computer.
  * If not, download from http://maven.apache.org and install.
  
* Install the JCo jar to your local Maven repository. You'll find jar and native libs here: \native-libs 
  > mvn install:install-file -DgroupId=com.sap -DartifactId=sap-jco -Dversion=3.0.5 -Dpackaging=jar -Dfile=sapjco3.jar

* Install native lib for your os (supported out of the box: Windows64bit, Mac64bit. Otherwise download from http://service.sap.com/connectors)  
  * Win64: > mvn install:install-file -DgroupId=com.sap -DartifactId=sap-jco -Dversion=3.0.5 -Dpackaging=jni -Dfile=sapjco3.dll -Dclassifier=NTAMD64
  * Mac64: > mvn install:install-file -DgroupId=com.sap -DartifactId=sap-jco -Dversion=3.0.5 -Dpackaging=jni -Dfile=libsapjco3.jnilib -Dclassifier=darwinintel64
  
* Configure JCo properties in hibersap.xml

* Run "mvn clean install"