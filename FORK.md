This fork add/changes the following:

- includes the (modified) commit ISSUE-1 from philiphoy/jcollectd (Network.getProp)
- includes the send interval option (jcd.sendinterval)
- includes the improvments from bolcom/jcollectd
- add common redisLog4jAppender regards to hardisgroupcom/log4j-redis-appender 
- add common redisLogbackAppender regards to hardisgroupcom/logback-redis-appender
- add common wagon regards to hardis framework
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