package org.reactor.jira;

import org.reactor.ReactorProperties;
import java.util.Properties;

public class JiraReactorProperties extends ReactorProperties {

    public static final String PROPERTY_URL = "reactor.jira.url";
    public static final String PROPERTY_USERNAME = "reactor.jira.username";
    public static final String PROPERTY_PASSWORD = "reactor.jira.password";
    public static final String PROPERTY_PROJECT_NAME = "reactor.jira.projectName";

    public JiraReactorProperties(Properties properties) {
        super(properties);
    }

    public String getUrl() {
        return getProperty(PROPERTY_URL);
    }

    public String getUsername() {
        return getProperty(PROPERTY_USERNAME);
    }

    public String getPassword() {
        return getProperty(PROPERTY_PASSWORD);
    }

    public String getProjectName() {
        return getProperty(PROPERTY_PROJECT_NAME);
    }

}
