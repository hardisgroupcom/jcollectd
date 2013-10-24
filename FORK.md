This fork add/changes the following:

- includes the (modified) commit ISSUE-1 from philiphoy/jcollectd (Network.getProp)
- includes the send interval option (jcd.sendinterval)
- add fine logging on UpdSender
- add logging of properties read (from JVM or from file)
- sanitize plugin,plugin-instance and type (remove spaces)
- add exclude attribute for mbean declaration; beans that match will be excluded. (e.g. exclude=".*Survivor.*" ). only applicable if name is a pattern 

Using
	-Djcd.properties=/tmp/jcd.properties
  
Example

	jcd.tmpl=javalang
	jcd.dest=udp://10.10.135.58:25826
	# send every 60 seconds
	jcd.sendinterval=60    
	
Other properties
	
    jcd.beans
    jcd.mx.url
    jcd.instance
    host
    hostname
    jcd.hostalias  // resolve order: alias, host, hostname
    jcd.namesOnly
    mx.metricTypeField  // metricType (default)
    mx.descriptors // true (default)
    laddr
    ifaddr

[![Build Status](https://drone.io/github.com/emicklei/jcollectd/status.png)](https://drone.io/github.com/emicklei/jcollectd/latest)

emicklei@bol.com