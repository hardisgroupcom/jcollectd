This fork add/changes the following:

- includes the (modified) commit ISSUE-1 from philiphoy/jcollectd (Network.getProp)
- includes the send interval option (jcd.sendinterval)
- add fine logging on UpdSender
- add logging of properties read (from JVM or from file)

Using
	-Djcd.properties=/tmp/jcd.properties
  
Example

	jcd.tmpl=javalang
	jcd.dest=udp://10.10.135.58:25826
	# send every 60 seconds
	jcd.sendinterval=60    

[![Build Status](https://drone.io/github.com/emicklei/jcollectd/status.png)](https://drone.io/github.com/emicklei/jcollectd/latest)

emicklei@bol.com