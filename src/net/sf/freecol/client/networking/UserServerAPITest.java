package net.sf.freecol.client.networking;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.client.gui.GUI;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>UserServerAPITest</code> contains tests for the class <code>{@link UserServerAPI}</code>.
 *
 * @generatedBy CodePro at 5/12/18 2:15 PM
 * @author Marcus
 * @version $Revision: 1.0 $
 */
public class UserServerAPITest {
	/**
	 * Run the UserServerAPI(GUI) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 2:15 PM
	 */
	@Test
	public void testUserServerAPI_1()
		throws Exception {
		GUI gui = new GUI(new FreeColClient(new ByteArrayInputStream("".getBytes()), ""), 1.0f);

		UserServerAPI result = new UserServerAPI(gui);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:407)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:396)
		//       at net.sf.freecol.client.FreeColClient.ifHeadless(FreeColClient.java:239)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:155)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:138)
		assertNotNull(result);
	}

	/**
	 * Run the void doClientProcessingFor(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 2:15 PM
	 */
	@Test
	public void testDoClientProcessingFor_1()
		throws Exception {
		UserServerAPI fixture = new UserServerAPI(new GUI(new FreeColClient(new ByteArrayInputStream("".getBytes()), ""), 1.0f));
		Element reply = new IIOMetadataNode();

		fixture.doClientProcessingFor(reply);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:407)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:396)
		//       at net.sf.freecol.client.FreeColClient.ifHeadless(FreeColClient.java:239)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:155)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:138)
	}

	/**
	 * Run the void doClientProcessingFor(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 2:15 PM
	 */
	@Test
	public void testDoClientProcessingFor_2()
		throws Exception {
		UserServerAPI fixture = new UserServerAPI(new GUI(new FreeColClient(new ByteArrayInputStream("".getBytes()), ""), 1.0f));
		Element reply = new IIOMetadataNode();

		fixture.doClientProcessingFor(reply);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:407)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:396)
		//       at net.sf.freecol.client.FreeColClient.ifHeadless(FreeColClient.java:239)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:155)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:138)
	}

	/**
	 * Run the void doClientProcessingFor(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 2:15 PM
	 */
	@Test
	public void testDoClientProcessingFor_3()
		throws Exception {
		UserServerAPI fixture = new UserServerAPI(new GUI(new FreeColClient(new ByteArrayInputStream("".getBytes()), ""), 1.0f));
		Element reply = new IIOMetadataNode();

		fixture.doClientProcessingFor(reply);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:407)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:396)
		//       at net.sf.freecol.client.FreeColClient.ifHeadless(FreeColClient.java:239)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:155)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:138)
	}

	/**
	 * Run the void doRaiseErrorMessage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 2:15 PM
	 */
	@Test
	public void testDoRaiseErrorMessage_1()
		throws Exception {
		UserServerAPI fixture = new UserServerAPI(new GUI(new FreeColClient(new ByteArrayInputStream("".getBytes()), ""), 1.0f));
		String complaint = "";

		fixture.doRaiseErrorMessage(complaint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:407)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:396)
		//       at net.sf.freecol.client.FreeColClient.ifHeadless(FreeColClient.java:239)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:155)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:138)
	}

	/**
	 * Run the void doRaiseErrorMessage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/18 2:15 PM
	 */
	@Test
	public void testDoRaiseErrorMessage_2()
		throws Exception {
		UserServerAPI fixture = new UserServerAPI(new GUI(new FreeColClient(new ByteArrayInputStream("".getBytes()), ""), 1.0f));
		String complaint = "";

		fixture.doRaiseErrorMessage(complaint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:407)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:396)
		//       at net.sf.freecol.client.FreeColClient.ifHeadless(FreeColClient.java:239)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:155)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:138)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/12/18 2:15 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/12/18 2:15 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/12/18 2:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UserServerAPITest.class);
	}
}
