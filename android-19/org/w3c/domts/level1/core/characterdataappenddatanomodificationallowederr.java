
/*
This Java source file was generated by test-to-java.xsl
and is a derived work from the source document.
The source document contained the following notice:


Copyright (c) 2001-2004 World Wide Web Consortium,
(Massachusetts Institute of Technology, Institut National de
Recherche en Informatique et en Automatique, Keio University). All
Rights Reserved. This program is distributed under the W3C's Software
Intellectual Property License. This program is distributed in the
hope that it will be useful, but WITHOUT ANY WARRANTY; without even
the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
PURPOSE.
See W3C License http://www.w3.org/Consortium/Legal/ for more details.

*/

package org.w3c.domts.level1.core;

import org.w3c.dom.*;


import org.w3c.domts.DOMTestCase;
import org.w3c.domts.DOMTestDocumentBuilderFactory;



/**
 *     The "appendData(arg)" method raises a NO_MODIFICATION_ALLOWED_ERR 
 *    DOMException if the node is readonly.  
 *    Obtain the children of the THIRD "gender" element.  The elements
 *    content is an entity reference.  Get the FIRST item 
 *    from the entity reference and execute the "appendData(arg)" method.
 *    This causes a NO_MODIFICATION_ALLOWED_ERR DOMException to be thrown.
* @author NIST
* @author Mary Brady
* @see <a href="http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#xpointer(id('ID-258A00AF')/constant[@name='NO_MODIFICATION_ALLOWED_ERR'])">http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#xpointer(id('ID-258A00AF')/constant[@name='NO_MODIFICATION_ALLOWED_ERR'])</a>
* @see <a href="http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#ID-32791A2F">http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#ID-32791A2F</a>
* @see <a href="http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#xpointer(id('ID-32791A2F')/raises/exception[@name='DOMException']/descr/p[substring-before(.,':')='NO_MODIFICATION_ALLOWED_ERR'])">http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#xpointer(id('ID-32791A2F')/raises/exception[@name='DOMException']/descr/p[substring-before(.,':')='NO_MODIFICATION_ALLOWED_ERR'])</a>
* @see <a href="http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#ID-32791A2F">http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#ID-32791A2F</a>
*/
public final class characterdataappenddatanomodificationallowederr extends DOMTestCase {

   /**
    * Constructor.
    * @param factory document factory, may not be null
    * @throws org.w3c.domts.DOMTestIncompatibleException Thrown if test is not compatible with parser configuration
    */
   public characterdataappenddatanomodificationallowederr(final DOMTestDocumentBuilderFactory factory)  throws org.w3c.domts.DOMTestIncompatibleException {
      super(factory);

    //
    //   check if loaded documents are supported for content type
    //
    String contentType = getContentType();
    preload(contentType, "staff", true);
    }

   /**
    * Runs the test case.
    * @throws Throwable Any uncaught exception causes test to fail
    */
   public void runTest() throws Throwable {
      Document doc;
      NodeList genderList;
      Node genderNode;
      Node entElement;
      Node entElementContent;
      Node entReference;
      int nodeType;
      doc = (Document) load("staff", true);
      genderList = doc.getElementsByTagName("gender");
      genderNode = genderList.item(2);
      entReference = genderNode.getFirstChild();
      assertNotNull("entReferenceNotNull", entReference);
      nodeType = (int) entReference.getNodeType();
      
      if (equals(1, nodeType)) {
          entReference = doc.createEntityReference("ent4");
      assertNotNull("createdEntRefNotNull", entReference);
      }
    entElement = entReference.getFirstChild();
      assertNotNull("entElementNotNull", entElement);
      entElementContent = entElement.getFirstChild();
      assertNotNull("entElementContentNotNull", entElementContent);
      
      {
         boolean success = false;
         try {
            ((CharacterData) /*Node */entElementContent).appendData("newString");
          } catch (DOMException ex) {
            success = (ex.code == DOMException.NO_MODIFICATION_ALLOWED_ERR);
         }
         assertTrue("throw_NO_MODIFICATION_ALLOWED_ERR", success);
      }
}
   /**
    *  Gets URI that identifies the test.
    *  @return uri identifier of test
    */
   public String getTargetURI() {
      return "http://www.w3.org/2001/DOM-Test-Suite/level1/core/characterdataappenddatanomodificationallowederr";
   }
   /**
    * Runs this test from the command line.
    * @param args command line arguments
    */
   public static void main(final String[] args) {
        DOMTestCase.doMain(characterdataappenddatanomodificationallowederr.class, args);
   }
}

