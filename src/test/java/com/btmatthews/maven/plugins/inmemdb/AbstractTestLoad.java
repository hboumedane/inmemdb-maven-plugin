/*
 * Copyright 2011 Brian Matthews
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.btmatthews.maven.plugins.inmemdb;

import org.apache.maven.plugin.MojoFailureException;
import org.junit.After;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Abstract base class for unit tests that load data.
 * 
 * @author <a href="mailto:brian@btmatthews.com">Brian Matthews</a>
 * @version 1.0
 * 
 */
public abstract class AbstractTestLoad extends AbstractTest {

	/**
	 * Prepare for each unit test by mock objects and test fixtures.
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		getDatabase().start(getLogger());
	}

	/**
	 * Clean-up after each unit test by shutting down the database.
	 * 
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		getDatabase().shutdown(getLogger());
	}
}