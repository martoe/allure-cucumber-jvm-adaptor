package ru.yandex.qatools.allure.cucumberjvm;

import org.junit.runner.Description;

/**
 * Created by sidochenko on 13.02.16.
 */
public class GherkinEntity {
    private GherkinEntityType gherkinEntityType;
    private Description gherkinEntity;

    public GherkinEntity(GherkinEntityType gherkinEntityType, Description gherkinEntity) {
        this.gherkinEntityType = gherkinEntityType;
        this.gherkinEntity = gherkinEntity;
    }

    public GherkinEntityType getType() {
        return gherkinEntityType;
    }

    public Description getObject() {
        return gherkinEntity;
    }
}
