package dev.springharvest.library.domains.books.integration.crud;

import dev.springharvest.library.books.models.dtos.BookDTO;
import dev.springharvest.library.books.models.entities.BookEntity;
import dev.springharvest.library.config.TestComponentScanningConfig;
import dev.springharvest.library.config.TestContainerConfig;
import dev.springharvest.library.constants.TestConstants;
import dev.springharvest.library.domains.books.integration.utils.helpers.BooksTestHelper;
import dev.springharvest.testing.integration.crud.AbstractBaseCrudIT;
import dev.springharvest.testing.integration.utils.clients.RestClientImpl;
import dev.springharvest.testing.integration.utils.listeners.LiquibaseTestExecutionListener;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import java.util.UUID;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Import(value = {TestComponentScanningConfig.class, TestContainerConfig.class})
@TestExecutionListeners(
        listeners = {DependencyInjectionTestExecutionListener.class, LiquibaseTestExecutionListener.class},
        mergeMode = TestExecutionListeners.MergeMode.MERGE_WITH_DEFAULTS)
@TestPropertySource(locations = "classpath:application.properties")
class BooksCrudIT extends AbstractBaseCrudIT<BookDTO, BookEntity, UUID> {

    @Autowired
    public BooksCrudIT(RestClientImpl clientHelper, BooksTestHelper testHelper) {
        super(clientHelper, testHelper);
    }

    @Test
    void contextLoads() {
        Assertions.assertTrue(true, TestConstants.Messages.CONTEXT_LOADS);
    }

}