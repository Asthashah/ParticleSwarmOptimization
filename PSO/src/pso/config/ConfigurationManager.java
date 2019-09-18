package pso.config;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Aastha
 */
public class ConfigurationManager {
    @Setter
    @Getter
    private Configuration config;

    public ConfigurationManager() {
        this.config = new Configuration();
    }
}
