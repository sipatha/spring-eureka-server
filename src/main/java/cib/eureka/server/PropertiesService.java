package cib.eureka.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.net.InetAddress;

@Service
public class PropertiesService {

    private static final Logger LOG = LoggerFactory.getLogger(PropertiesService.class);

    @PostConstruct
    public void debug() {
        try {
            LOG.info("hostname: {}", InetAddress.getLocalHost().getHostName());

            for(String name : System.getProperties().stringPropertyNames()) {
                LOG.info("{} : {}", name, System.getProperty(name));
            }
        } catch (Exception e) {}
    }

}
