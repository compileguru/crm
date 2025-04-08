package com.compileguru.crm;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // Forces H2 instead of PostgreSQL
class CrmApplicationTests {
}
