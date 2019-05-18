# AWSOpenWater
AWS OpenWater adds AWS functionality to my previously existing OpenWater project. The Java application scrapes water temperature data from an NOAA XML feed, processes it, and then sends it via email to a list of recipients. The previous version of this project used the JavaMail library but was modified to use the AWS Simple Email Service Java SDK instead.

AWS OpenWater runs on an EC2 instance in the AWS cloud. I uploaded it to the EC2 instance as an executable .jar file and it runs via a bash script so that each recipient receives a water temperature email every morning at 5:00AM PST.
