package ru.yandex.qatools.allure.cucumberjvm;

/**
 * Created by Viktor Sidochenko on 13.02.16.
 *
 * <p>
 * Gherkin scenario represented by feature and scenario itself.</p>
 */
public class Scenario {

    private final GherkinEntity feature;
    private final GherkinEntity scenario;

    public Scenario(GherkinEntity feature, GherkinEntity scenario) {
        this.feature = feature;
        this.scenario = scenario;
    }

    /**
     * <p>
     * Get feature.</p>
     *
     * @return {@link GherkinEntity}
     */
    public GherkinEntity getFeature() {
        return feature;
    }

    /**
     * <p>
     * Get Scenario.</p>
     *
     * @return {@link GherkinEntity}
     */
    public GherkinEntity getScenario() {
        return scenario;
    }

}
