
/*
This Java source file was generated by test-to-java.xsl
and is a derived work from the source document.
The source document contained the following notice:





Copyright (c) 2001 World Wide Web Consortium, 

(Massachusetts Institute of Technology, Institut National de

Recherche en Informatique et en Automatique, Keio University).  All 

Rights Reserved.  This program is distributed under the W3C's Software

Intellectual Property License.  This program is distributed in the 

hope that it will be useful, but WITHOUT ANY WARRANTY; without even

the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR 

PURPOSE.  



See W3C License http://www.w3.org/Consortium/Legal/ for more details.




*/

package org.w3c.domts.level2.core;

import org.w3c.dom.*;


import org.w3c.domts.DOMTestCase;
import org.w3c.domts.DOMTestDocumentBuilderFactory;



/**
 *  The method createElementNS creates an element of the given valid qualifiedName and NamespaceURI. 
 *  
 *  Invoke the createElementNS method on this Document object with null values for namespaceURI, 
 *  and a qualifiedName with an invalid character and check if an INVALID_CHARACTER_ERR is thrown.
* @author IBM
* @author Neil Delima
* @see <a href="http://www.w3.org/TR/DOM-Level-2-Core/core">http://www.w3.org/TR/DOM-Level-2-Core/core</a>
* @see <a href="http://www.w3.org/TR/DOM-Level-2-Core/core#ID-DocCrElNS">http://www.w3.org/TR/DOM-Level-2-Core/core#ID-DocCrElNS</a>
*/
public final class documentcreateelementNS02 extends DOMTestCase {

   /**
    * Constructor.
    * @param factory document factory, may not be null
    * @throws org.w3c.domts.DOMTestIncompatibleException Thrown if test is not compatible with parser configuration
    */
   public documentcreateelementNS02(final DOMTestDocumentBuilderFactory factory)  throws org.w3c.domts.DOMTestIncompatibleException {
      super(factory);

    //
    //   check if loaded documents are supported for content type
    //
    String contentType = getContentType();
    preload(contentType, "staffNS", false);
    }

   /**
    * Runs the test case.
    * @throws Throwable Any uncaught exception causes test to fail
    */
   public void runTest() throws Throwable {
      Document doc;
      Element element;
      String namespaceURI = null;

      String qualifiedName = "^^";
      doc = (Document) load("staffNS", false);
      
      {
         boolean success = false;
         try {
            element = doc.createElementNS(namespaceURI, qualifiedName);
          } catch (DOMException ex) {
            success = (ex.code == DOMException.INVALID_CHARACTER_ERR);
         }
         assertTrue("documentcreateelementNS02", success);
      }
}
   /**
    *  Gets URI that identifies the test.
    *  @return uri identifier of test
    */
   public String getTargetURI() {
      return "http://www.w3.org/2001/DOM-Test-Suite/level2/core/documentcreateelementNS02";
   }
   /**
    * Runs this test from the command line.
    * @param args command line arguments
    */
   public static void main(final String[] args) {
        DOMTestCase.doMain(documentcreateelementNS02.class, args);
   }
}

