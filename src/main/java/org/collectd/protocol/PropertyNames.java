package org.collectd.protocol;

public interface PropertyNames {
    String KEY_PREFIX = "jcd.";
    
    String SEND_INTERVAL = "jcd.sendinterval";
    String TEMPLATE = "jcd.tmpl";
    String BEANS = "jcd.beans";
    String DESTINATION = "jcd.dest";
    String CONNECTION_URL = "jcd.mx.url";
    String INSTANCE = "jcd.instance";
    String HOST = "host";
    String HOSTNAME = "hostname";
    String HOSTALIAS = "jcd.hostalias";  // resolve order: alias, host, hostname
    String NAMES_ONLY = "jcd.namesOnly";
    String METRIC_TYPE_FIELD = "mx.metricTypeField";  // metricType (default)
    String MX_DESCRIPTORS = "mx.descriptors"; // true (default)
    String LOCAL_ADDRESS = "laddr";
    String INTERFACE_ADDRESS = "ifaddr";
}
