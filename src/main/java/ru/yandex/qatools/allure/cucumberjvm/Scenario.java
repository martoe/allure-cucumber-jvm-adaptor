package ru.yandex.qatools.allure.cucumberjvm;

/**
 * Created by sidochenko on 13.02.16.
 */
public class Scenario {
    private GherkinEntity feature;
    private GherkinEntity scenario;

    public Scenario(GherkinEntity feature, GherkinEntity scenario) {
        this.feature = feature;
        this.scenario = scenario;
    }

    public GherkinEntity getFeature() {
        return feature;
    }

    public GherkinEntity getScenario() {
        return scenario;
    }

}
