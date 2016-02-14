package ru.yandex.qatools.allure.cucumberjvm;

import gherkin.formatter.model.Feature;
import gherkin.formatter.model.ScenarioOutline;
import org.junit.runner.Description;

/**
 * Created by Viktor Sidochenko on 13.02.16.
 *
 * <p>
 * Object which represents gherkin entity via its type and {@link Description}
 */
public class GherkinEntity {

    private final GherkinEntityType gherkinEntityType;
    private final Description gherkinEntity;

    public GherkinEntity(GherkinEntityType gherkinEntityType, Description gherkinEntity) {
        this.gherkinEntityType = gherkinEntityType;
        this.gherkinEntity = gherkinEntity;
    }

    /**
     * <p>
     * Get type. It can be one of {@link GherkinEntityType} values.</p>
     *
     * @return {@link GherkinEntityType}
     */
    public GherkinEntityType getType() {
        return gherkinEntityType;
    }

    /**
     * Get entity description
     *
     * @return {@link Description}
     */
    public Description getObject() {
        return gherkinEntity;
    }
}
