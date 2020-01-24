package io.quarkus.smallrye.reactivemessaging.camel.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

public class SmallRyeReactiveMessagingCamelProcessor {
    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FeatureBuildItem.SMALLRYE_REACTIVE_MESSAGING_CAMEL);
    }
}
