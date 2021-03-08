package test.named;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.inject.Inject;
import javax.inject.Named;

@MicronautTest
class TestNamedTest {

    @Inject @Named("Guild") CRUDValidator guildCrudValidator;
    @Inject @Named("ActionItem") CRUDValidator actionItemCrudValidator;

    @Test
    void testItWorks() {
        Assertions.assertTrue(guildCrudValidator instanceof GuildCRUDValidator);
        Assertions.assertTrue(actionItemCrudValidator instanceof ActionItemCRUDValidator);
    }

}
