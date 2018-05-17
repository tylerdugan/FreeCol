package net.sf.freecol.common.debug;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import net.sf.freecol.server.FreeColServer;
import java.util.ArrayList;
import java.util.List;
import net.sf.freecol.common.model.Unit;
import net.sf.freecol.common.model.Specification;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.model.IndianSettlement;
import net.sf.freecol.client.FreeColClient;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import net.sf.freecol.common.model.TileItemContainer;
import net.sf.freecol.common.model.Player;
import org.junit.*;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.Colony;
import net.sf.freecol.common.model.Tile;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>DebugUtilsTest</code> contains tests for the class <code>{@link DebugUtils}</code>.
 *
 * @generatedBy CodePro at 5/13/18 5:49 PM
 * @author Marcus
 * @version $Revision: 1.0 $
 */
public class DebugUtilsTest {
	/**
	 * Run the DebugUtils() constructor test.
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDebugUtils_1()
		throws Exception {
		DebugUtils result = new DebugUtils();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void addBuildings(FreeColClient,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddBuildings_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		String buildingTitle = "";

		DebugUtils.addBuildings(freeColClient, buildingTitle);

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
	 * Run the void addBuildings(FreeColClient,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddBuildings_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		String buildingTitle = "";

		DebugUtils.addBuildings(freeColClient, buildingTitle);

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
	 * Run the void addBuildings(FreeColClient,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddBuildings_3()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		String buildingTitle = "";

		DebugUtils.addBuildings(freeColClient, buildingTitle);

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
	 * Run the void addBuildings(FreeColClient,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddBuildings_4()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		String buildingTitle = "";

		DebugUtils.addBuildings(freeColClient, buildingTitle);

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
	 * Run the void addBuildings(FreeColClient,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddBuildings_5()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		String buildingTitle = "";

		DebugUtils.addBuildings(freeColClient, buildingTitle);

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
	 * Run the void addBuildings(FreeColClient,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddBuildings_6()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		String buildingTitle = "";

		DebugUtils.addBuildings(freeColClient, buildingTitle);

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
	 * Run the void addBuildings(FreeColClient,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddBuildings_7()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		String buildingTitle = "";

		DebugUtils.addBuildings(freeColClient, buildingTitle);

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
	 * Run the void addBuildings(FreeColClient,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddBuildings_8()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		String buildingTitle = "";

		DebugUtils.addBuildings(freeColClient, buildingTitle);

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
	 * Run the void addBuildings(FreeColClient,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddBuildings_9()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		String buildingTitle = "";

		DebugUtils.addBuildings(freeColClient, buildingTitle);

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
	 * Run the void addFathers(FreeColClient,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddFathers_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		String fatherTitle = "";

		DebugUtils.addFathers(freeColClient, fatherTitle);

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
	 * Run the void addFathers(FreeColClient,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddFathers_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		String fatherTitle = "";

		DebugUtils.addFathers(freeColClient, fatherTitle);

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
	 * Run the void addGold(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddGold_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.addGold(freeColClient);

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
	 * Run the void addGold(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddGold_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.addGold(freeColClient);

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
	 * Run the void addGold(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddGold_3()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.addGold(freeColClient);

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
	 * Run the void addGold(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddGold_4()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.addGold(freeColClient);

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
	 * Run the void addImmigration(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddImmigration_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.addImmigration(freeColClient);

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
	 * Run the void addImmigration(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddImmigration_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.addImmigration(freeColClient);

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
	 * Run the void addImmigration(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddImmigration_3()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.addImmigration(freeColClient);

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
	 * Run the void addImmigration(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddImmigration_4()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.addImmigration(freeColClient);

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
	 * Run the void addLiberty(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddLiberty_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.addLiberty(freeColClient);

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
	 * Run the void addLiberty(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddLiberty_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.addLiberty(freeColClient);

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
	 * Run the void addLiberty(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddLiberty_3()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.addLiberty(freeColClient);

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
	 * Run the void addLiberty(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddLiberty_4()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.addLiberty(freeColClient);

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
	 * Run the void addLiberty(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddLiberty_5()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.addLiberty(freeColClient);

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
	 * Run the void addNewUnitToTile(FreeColClient,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddNewUnitToTile_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.addNewUnitToTile(freeColClient, tile);

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
	 * Run the void addNewUnitToTile(FreeColClient,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddNewUnitToTile_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.addNewUnitToTile(freeColClient, tile);

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
	 * Run the void addNewUnitToTile(FreeColClient,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddNewUnitToTile_3()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.addNewUnitToTile(freeColClient, tile);

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
	 * Run the void addNewUnitToTile(FreeColClient,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddNewUnitToTile_4()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.addNewUnitToTile(freeColClient, tile);

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
	 * Run the void addNewUnitToTile(FreeColClient,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddNewUnitToTile_5()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.addNewUnitToTile(freeColClient, tile);

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
	 * Run the void addNewUnitToTile(FreeColClient,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddNewUnitToTile_6()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.addNewUnitToTile(freeColClient, tile);

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
	 * Run the void addNewUnitToTile(FreeColClient,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddNewUnitToTile_7()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.addNewUnitToTile(freeColClient, tile);

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
	 * Run the void addNewUnitToTile(FreeColClient,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddNewUnitToTile_8()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.addNewUnitToTile(freeColClient, tile);

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
	 * Run the void addNewUnitToTile(FreeColClient,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddNewUnitToTile_9()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.addNewUnitToTile(freeColClient, tile);

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
	 * Run the void addNewUnitToTile(FreeColClient,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddNewUnitToTile_10()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.addNewUnitToTile(freeColClient, tile);

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
	 * Run the void addNewUnitToTile(FreeColClient,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddNewUnitToTile_11()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.addNewUnitToTile(freeColClient, tile);

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
	 * Run the void addNewUnitToTile(FreeColClient,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddNewUnitToTile_12()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.addNewUnitToTile(freeColClient, tile);

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
	 * Run the void addNewUnitToTile(FreeColClient,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddNewUnitToTile_13()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.addNewUnitToTile(freeColClient, tile);

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
	 * Run the void addSkipChangeListener(FreeColClient,JMenu,JMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddSkipChangeListener_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer((FreeColServer) null);
		JMenu menu = new JMenu();
		JMenuItem item = new JMenuItem();

		DebugUtils.addSkipChangeListener(freeColClient, menu, item);

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
	 * Run the void addUnitGoods(FreeColClient,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddUnitGoods_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		DebugUtils.addUnitGoods(freeColClient, unit);

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
	 * Run the void addUnitGoods(FreeColClient,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddUnitGoods_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		DebugUtils.addUnitGoods(freeColClient, unit);

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
	 * Run the void addUnitGoods(FreeColClient,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddUnitGoods_3()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		DebugUtils.addUnitGoods(freeColClient, unit);

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
	 * Run the void addUnitGoods(FreeColClient,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddUnitGoods_4()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		DebugUtils.addUnitGoods(freeColClient, unit);

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
	 * Run the void addUnitGoods(FreeColClient,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddUnitGoods_5()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		DebugUtils.addUnitGoods(freeColClient, unit);

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
	 * Run the void addUnitGoods(FreeColClient,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddUnitGoods_6()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		DebugUtils.addUnitGoods(freeColClient, unit);

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
	 * Run the void addUnitGoods(FreeColClient,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testAddUnitGoods_7()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		DebugUtils.addUnitGoods(freeColClient, unit);

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
	 * Run the void applyDisaster(FreeColClient,Colony) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testApplyDisaster_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.applyDisaster(freeColClient, colony);

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
	 * Run the void applyDisaster(FreeColClient,Colony) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testApplyDisaster_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.applyDisaster(freeColClient, colony);

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
	 * Run the void applyDisaster(FreeColClient,Colony) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testApplyDisaster_3()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.applyDisaster(freeColClient, colony);

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
	 * Run the void applyDisaster(FreeColClient,Colony) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testApplyDisaster_4()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.applyDisaster(freeColClient, colony);

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
	 * Run the void changeOwnership(FreeColClient,Colony) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testChangeOwnership_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.changeOwnership(freeColClient, colony);

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
	 * Run the void changeOwnership(FreeColClient,Colony) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testChangeOwnership_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.changeOwnership(freeColClient, colony);

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
	 * Run the void changeOwnership(FreeColClient,Colony) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testChangeOwnership_3()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.changeOwnership(freeColClient, colony);

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
	 * Run the void changeOwnership(FreeColClient,Colony) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testChangeOwnership_4()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.changeOwnership(freeColClient, colony);

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
	 * Run the void changeOwnership(FreeColClient,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testChangeOwnership_5()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		DebugUtils.changeOwnership(freeColClient, unit);

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
	 * Run the void changeOwnership(FreeColClient,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testChangeOwnership_6()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.changeOwnership(freeColClient, unit);

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
	 * Run the void changeOwnership(FreeColClient,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testChangeOwnership_7()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.changeOwnership(freeColClient, unit);

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
	 * Run the void changeOwnership(FreeColClient,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testChangeOwnership_8()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.changeOwnership(freeColClient, unit);

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
	 * Run the void changeRole(FreeColClient,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testChangeRole_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		DebugUtils.changeRole(freeColClient, unit);

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
	 * Run the void changeRole(FreeColClient,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testChangeRole_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		DebugUtils.changeRole(freeColClient, unit);

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
	 * Run the boolean checkDesyncAction(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testCheckDesyncAction_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));

		boolean result = DebugUtils.checkDesyncAction(freeColClient);

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
		assertTrue(result);
	}

	/**
	 * Run the boolean checkDesyncAction(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testCheckDesyncAction_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));

		boolean result = DebugUtils.checkDesyncAction(freeColClient);

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
		assertTrue(result);
	}

	/**
	 * Run the boolean checkDesyncAction(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testCheckDesyncAction_3()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));

		boolean result = DebugUtils.checkDesyncAction(freeColClient);

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
		assertTrue(result);
	}

	/**
	 * Run the boolean checkDesyncAction(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testCheckDesyncAction_4()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));

		boolean result = DebugUtils.checkDesyncAction(freeColClient);

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
		assertTrue(result);
	}

	/**
	 * Run the boolean checkDesyncAction(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testCheckDesyncAction_5()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));

		boolean result = DebugUtils.checkDesyncAction(freeColClient);

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
		assertTrue(result);
	}

	/**
	 * Run the boolean checkDesyncAction(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testCheckDesyncAction_6()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));

		boolean result = DebugUtils.checkDesyncAction(freeColClient);

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
		assertTrue(result);
	}

	/**
	 * Run the boolean checkDesyncAction(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testCheckDesyncAction_7()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));

		boolean result = DebugUtils.checkDesyncAction(freeColClient);

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
		assertTrue(result);
	}

	/**
	 * Run the boolean checkDesyncAction(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testCheckDesyncAction_8()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));

		boolean result = DebugUtils.checkDesyncAction(freeColClient);

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
		assertTrue(result);
	}

	/**
	 * Run the boolean checkDesyncAction(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testCheckDesyncAction_9()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));

		boolean result = DebugUtils.checkDesyncAction(freeColClient);

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
		assertTrue(result);
	}

	/**
	 * Run the void displayColonyPlan(FreeColClient,Colony) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayColonyPlan_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.displayColonyPlan(freeColClient, colony);

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
	 * Run the void displayColonyPlan(FreeColClient,Colony) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayColonyPlan_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.displayColonyPlan(freeColClient, colony);

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
	 * Run the void displayEurope(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayEurope_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.displayEurope(freeColClient);

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
	 * Run the void displayEurope(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayEurope_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.displayEurope(freeColClient);

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
	 * Run the void displayEurope(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayEurope_3()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.displayEurope(freeColClient);

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
	 * Run the void displayEurope(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayEurope_4()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.displayEurope(freeColClient);

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
	 * Run the void displayEurope(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayEurope_5()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.displayEurope(freeColClient);

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
	 * Run the void displayEurope(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayEurope_6()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.displayEurope(freeColClient);

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
	 * Run the void displayEurope(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayEurope_7()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.displayEurope(freeColClient);

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
	 * Run the void displayEurope(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayEurope_8()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.displayEurope(freeColClient);

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
	 * Run the void displayEurope(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayEurope_9()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.displayEurope(freeColClient);

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
	 * Run the void displayEurope(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayEurope_10()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.displayEurope(freeColClient);

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
	 * Run the void displayEurope(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayEurope_11()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.displayEurope(freeColClient);

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
	 * Run the void displayEurope(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayEurope_12()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.displayEurope(freeColClient);

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
	 * Run the void displayEurope(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayEurope_13()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.displayEurope(freeColClient);

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
	 * Run the void displayEurope(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayEurope_14()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.displayEurope(freeColClient);

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
	 * Run the void displayEurope(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayEurope_15()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.displayEurope(freeColClient);

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
	 * Run the void displayEurope(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayEurope_16()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.displayEurope(freeColClient);

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
	 * Run the void displayMission(FreeColClient,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayMission_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		DebugUtils.displayMission(freeColClient, unit);

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
	 * Run the void displayMission(FreeColClient,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayMission_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		DebugUtils.displayMission(freeColClient, unit);

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
	 * Run the void displayMission(FreeColClient,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayMission_3()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		DebugUtils.displayMission(freeColClient, unit);

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
	 * Run the void displayUnits(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayUnits_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.displayUnits(freeColClient);

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
	 * Run the void displayUnits(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayUnits_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.displayUnits(freeColClient);

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
	 * Run the void displayUnits(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayUnits_3()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.displayUnits(freeColClient);

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
	 * Run the void displayUnits(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayUnits_4()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.displayUnits(freeColClient);

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
	 * Run the void displayUnits(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayUnits_5()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.displayUnits(freeColClient);

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
	 * Run the void displayUnits(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayUnits_6()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.displayUnits(freeColClient);

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
	 * Run the void displayUnits(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayUnits_7()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.displayUnits(freeColClient);

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
	 * Run the void displayUnits(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayUnits_8()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.displayUnits(freeColClient);

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
	 * Run the void displayUnits(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayUnits_9()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.displayUnits(freeColClient);

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
	 * Run the void displayUnits(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayUnits_10()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.displayUnits(freeColClient);

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
	 * Run the void displayUnits(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayUnits_11()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.displayUnits(freeColClient);

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
	 * Run the void displayUnits(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayUnits_12()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.displayUnits(freeColClient);

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
	 * Run the void displayUnits(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayUnits_13()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.displayUnits(freeColClient);

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
	 * Run the void displayUnits(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayUnits_14()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.displayUnits(freeColClient);

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
	 * Run the void displayUnits(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayUnits_15()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.displayUnits(freeColClient);

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
	 * Run the void displayUnits(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDisplayUnits_16()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DebugUtils.displayUnits(freeColClient);

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
	 * Run the void dumpTile(FreeColClient,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testDumpTile_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.dumpTile(freeColClient, tile);

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
	 * Run the String getColonyValue(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testGetColonyValue_1()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		String result = DebugUtils.getColonyValue(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getColonyValue(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testGetColonyValue_2()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		String result = DebugUtils.getColonyValue(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getColonyValue(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testGetColonyValue_3()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		String result = DebugUtils.getColonyValue(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void resetMoves(FreeColClient,List<Unit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testResetMoves_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		List<Unit> units = new ArrayList<Unit>();

		DebugUtils.resetMoves(freeColClient, units);

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
	 * Run the void resetMoves(FreeColClient,List<Unit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testResetMoves_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		List<Unit> units = new ArrayList<Unit>();

		DebugUtils.resetMoves(freeColClient, units);

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
	 * Run the void resetMoves(FreeColClient,List<Unit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testResetMoves_3()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		List<Unit> units = new ArrayList<Unit>();

		DebugUtils.resetMoves(freeColClient, units);

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
	 * Run the void resetMoves(FreeColClient,List<Unit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testResetMoves_4()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		List<Unit> units = new ArrayList<Unit>();

		DebugUtils.resetMoves(freeColClient, units);

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
	 * Run the void resetMoves(FreeColClient,List<Unit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testResetMoves_5()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		List<Unit> units = new ArrayList<Unit>();

		DebugUtils.resetMoves(freeColClient, units);

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
	 * Run the void revealMap(FreeColClient,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testRevealMap_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		boolean reveal = false;

		DebugUtils.revealMap(freeColClient, reveal);

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
	 * Run the void revealMap(FreeColClient,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testRevealMap_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		freeColClient.setGame(new Game(new IIOMetadataNode(), ""));
		boolean reveal = true;

		DebugUtils.revealMap(freeColClient, reveal);

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
	 * Run the void setColonyGoods(FreeColClient,Colony) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSetColonyGoods_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.setColonyGoods(freeColClient, colony);

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
	 * Run the void setColonyGoods(FreeColClient,Colony) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSetColonyGoods_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.setColonyGoods(freeColClient, colony);

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
	 * Run the void setColonyGoods(FreeColClient,Colony) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSetColonyGoods_3()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.setColonyGoods(freeColClient, colony);

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
	 * Run the void setColonyGoods(FreeColClient,Colony) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSetColonyGoods_4()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.setColonyGoods(freeColClient, colony);

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
	 * Run the void setColonyGoods(FreeColClient,Colony) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSetColonyGoods_5()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.setColonyGoods(freeColClient, colony);

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
	 * Run the void setMonarchAction(FreeColClient,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSetMonarchAction_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		String monarchTitle = "";

		DebugUtils.setMonarchAction(freeColClient, monarchTitle);

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
	 * Run the void setMonarchAction(FreeColClient,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSetMonarchAction_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		String monarchTitle = "";

		DebugUtils.setMonarchAction(freeColClient, monarchTitle);

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
	 * Run the void setRumourType(FreeColClient,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSetRumourType_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.setRumourType(freeColClient, tile);

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
	 * Run the void setRumourType(FreeColClient,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSetRumourType_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		tile.setTileItemContainer(new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));

		DebugUtils.setRumourType(freeColClient, tile);

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
	 * Run the void skipTurns(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSkipTurns_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");

		DebugUtils.skipTurns(freeColClient);

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
	 * Run the void skipTurns(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSkipTurns_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");

		DebugUtils.skipTurns(freeColClient);

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
	 * Run the void skipTurns(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSkipTurns_3()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");

		DebugUtils.skipTurns(freeColClient);

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
	 * Run the void skipTurns(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSkipTurns_4()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");

		DebugUtils.skipTurns(freeColClient);

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
	 * Run the void skipTurns(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSkipTurns_5()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");

		DebugUtils.skipTurns(freeColClient);

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
	 * Run the void skipTurns(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSkipTurns_6()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");

		DebugUtils.skipTurns(freeColClient);

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
	 * Run the void stepRNG(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testStepRNG_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.stepRNG(freeColClient);

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
	 * Run the void stepRNG(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testStepRNG_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.stepRNG(freeColClient);

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
	 * Run the void summarizeSettlement(FreeColClient,IndianSettlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSummarizeSettlement_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		IndianSettlement is = new IndianSettlement(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.summarizeSettlement(freeColClient, is);

		// add additional test code here
	}

	/**
	 * Run the void summarizeSettlement(FreeColClient,IndianSettlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSummarizeSettlement_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		IndianSettlement is = new IndianSettlement(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.summarizeSettlement(freeColClient, is);

		// add additional test code here
	}

	/**
	 * Run the void summarizeSettlement(FreeColClient,IndianSettlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSummarizeSettlement_3()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		IndianSettlement is = new IndianSettlement(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.summarizeSettlement(freeColClient, is);

		// add additional test code here
	}

	/**
	 * Run the void summarizeSettlement(FreeColClient,IndianSettlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSummarizeSettlement_4()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		IndianSettlement is = new IndianSettlement(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.summarizeSettlement(freeColClient, is);

		// add additional test code here
	}

	/**
	 * Run the void summarizeSettlement(FreeColClient,IndianSettlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSummarizeSettlement_5()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		IndianSettlement is = new IndianSettlement(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.summarizeSettlement(freeColClient, is);

		// add additional test code here
	}

	/**
	 * Run the void summarizeSettlement(FreeColClient,IndianSettlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSummarizeSettlement_6()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		IndianSettlement is = new IndianSettlement(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.summarizeSettlement(freeColClient, is);

		// add additional test code here
	}

	/**
	 * Run the void summarizeSettlement(FreeColClient,IndianSettlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSummarizeSettlement_7()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		IndianSettlement is = new IndianSettlement(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.summarizeSettlement(freeColClient, is);

		// add additional test code here
	}

	/**
	 * Run the void summarizeSettlement(FreeColClient,IndianSettlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSummarizeSettlement_8()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		IndianSettlement is = new IndianSettlement(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.summarizeSettlement(freeColClient, is);

		// add additional test code here
	}

	/**
	 * Run the void summarizeSettlement(FreeColClient,IndianSettlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSummarizeSettlement_9()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		IndianSettlement is = new IndianSettlement(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.summarizeSettlement(freeColClient, is);

		// add additional test code here
	}

	/**
	 * Run the void summarizeSettlement(FreeColClient,IndianSettlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSummarizeSettlement_10()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		IndianSettlement is = new IndianSettlement(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.summarizeSettlement(freeColClient, is);

		// add additional test code here
	}

	/**
	 * Run the void summarizeSettlement(FreeColClient,IndianSettlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSummarizeSettlement_11()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		IndianSettlement is = new IndianSettlement(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.summarizeSettlement(freeColClient, is);

		// add additional test code here
	}

	/**
	 * Run the void summarizeSettlement(FreeColClient,IndianSettlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSummarizeSettlement_12()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		IndianSettlement is = new IndianSettlement(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.summarizeSettlement(freeColClient, is);

		// add additional test code here
	}

	/**
	 * Run the void summarizeSettlement(FreeColClient,IndianSettlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSummarizeSettlement_13()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		IndianSettlement is = new IndianSettlement(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.summarizeSettlement(freeColClient, is);

		// add additional test code here
	}

	/**
	 * Run the void summarizeSettlement(FreeColClient,IndianSettlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSummarizeSettlement_14()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		IndianSettlement is = new IndianSettlement(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.summarizeSettlement(freeColClient, is);

		// add additional test code here
	}

	/**
	 * Run the void summarizeSettlement(FreeColClient,IndianSettlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSummarizeSettlement_15()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		IndianSettlement is = new IndianSettlement(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.summarizeSettlement(freeColClient, is);

		// add additional test code here
	}

	/**
	 * Run the void summarizeSettlement(FreeColClient,IndianSettlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testSummarizeSettlement_16()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		IndianSettlement is = new IndianSettlement(new Game(new IIOMetadataNode(), ""), "");

		DebugUtils.summarizeSettlement(freeColClient, is);

		// add additional test code here
	}

	/**
	 * Run the void useAI(FreeColClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	@Test
	public void testUseAI_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setMyPlayer(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));

		DebugUtils.useAI(freeColClient);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/13/18 5:49 PM
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
	 * @generatedBy CodePro at 5/13/18 5:49 PM
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
	 * @generatedBy CodePro at 5/13/18 5:49 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DebugUtilsTest.class);
	}
}