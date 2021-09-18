package com.skilldistillery.jpacrud.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpacrud.entities.SellerListings;

class SellerListingsTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private SellerListings listings;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPASellerListings");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		listings = em.find(SellerListings.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		listings = null;
	}

	@Test
	void test_SellerListings_entity_mapping() {
		assertNotNull(listings);
		assertEquals("Keldeo GX", listings.getName());
		assertEquals("Basic Pokemon", listings.getType());
		assertEquals("Near Mint", listings.getCondition());
		assertEquals("Sleeved immediately upon opening.  I am not a grader; however, this card looks immaculate!", listings.getConditionDescription());
		assertEquals("47/236", listings.getCardNumber());
		assertEquals("Sun & Moon: Unified Minds", listings.getSeries());
//		assertEquals("Keldeo GX", listings.getName());
//		assertEquals("Keldeo GX", listings.getName());
	}

}
