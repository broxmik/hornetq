/*
 * JBoss, Home of Professional Open Source
 * Copyright 2005-2008, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.messaging.tests.unit.core.postoffice.impl;

import org.jboss.messaging.core.postoffice.AddressManager;
import org.jboss.messaging.core.postoffice.impl.SimpleAddressManager;
import org.jboss.messaging.tests.unit.core.server.impl.fakes.FakeQueueFactory;
import org.jboss.messaging.tests.util.UnitTestCase;

/**
 * @author <a href="mailto:andy.taylor@jboss.org">Andy Taylor</a>
 */
public class SimpleAddressManagerTest extends UnitTestCase
{
   AddressManager sam;
   FakeQueueFactory fqf = new FakeQueueFactory();

   protected void setUp() throws Exception
   {
      super.setUp();

      sam = new SimpleAddressManager();
   }
//
//   public void testAddDestinations()
//   {
//      SimpleString address = new SimpleString("add1");
//      SimpleString address2 = new SimpleString("add2");
//      SimpleString address3 = new SimpleString("add3");
//      SimpleString address4 = new SimpleString("add4");
//      SimpleString address5 = new SimpleString("add5");
//      sam.addDestination(address);
//      sam.addDestination(address2);
//      sam.addDestination(address3);
//      sam.addDestination(address4);
//      sam.addDestination(address5);
//      assertTrue(sam.containsDestination(address));
//      assertTrue(sam.containsDestination(address2));
//      assertTrue(sam.containsDestination(address3));
//      assertTrue(sam.containsDestination(address4));
//      assertTrue(sam.containsDestination(address5));
//      assertEquals(sam.getDestinations().size(), 5);
//   }
//
//   public void testAddSameDestination()
//   {
//      SimpleString address = new SimpleString("add1");
//      SimpleString address2 = new SimpleString("add2");
//      SimpleString address3 = new SimpleString("add3");
//      SimpleString address4 = new SimpleString("add4");
//      SimpleString address5 = new SimpleString("add4");
//      sam.addDestination(address);
//      sam.addDestination(address2);
//      sam.addDestination(address3);
//      sam.addDestination(address4);
//      sam.addDestination(address5);
//      assertTrue(sam.containsDestination(address));
//      assertTrue(sam.containsDestination(address2));
//      assertTrue(sam.containsDestination(address3));
//      assertTrue(sam.containsDestination(address4));
//      assertTrue(sam.containsDestination(address5));
//      assertEquals(sam.getDestinations().size(), 4);
//   }
//
//   public void testRemoveDestinations()
//   {
//      SimpleString address = new SimpleString("add1");
//      SimpleString address2 = new SimpleString("add2");
//      SimpleString address3 = new SimpleString("add3");
//      SimpleString address4 = new SimpleString("add4");
//      SimpleString address5 = new SimpleString("add5");
//      sam.addDestination(address);
//      sam.addDestination(address2);
//      sam.addDestination(address3);
//      sam.addDestination(address4);
//      sam.addDestination(address5);
//      assertTrue(sam.containsDestination(address));
//      assertTrue(sam.containsDestination(address2));
//      assertTrue(sam.containsDestination(address3));
//      assertTrue(sam.containsDestination(address4));
//      assertTrue(sam.containsDestination(address5));
//      assertEquals(sam.getDestinations().size(), 5);
//      sam.removeDestination(address2);
//      sam.removeDestination(address4);
//      assertTrue(sam.containsDestination(address));
//      assertFalse(sam.containsDestination(address2));
//      assertTrue(sam.containsDestination(address3));
//      assertFalse(sam.containsDestination(address4));
//      assertTrue(sam.containsDestination(address5));
//      assertEquals(sam.getDestinations().size(), 3);
//   }
//
//   public void testAddBinding()
//   {
//      SimpleString qName = new SimpleString("q1");
//      SimpleString qName2 = new SimpleString("q2");
//      SimpleString qName3 = new SimpleString("q3");
//      SimpleString qName4 = new SimpleString("q4");
//      SimpleString qName5 = new SimpleString("q5");
//      SimpleString address = new SimpleString("add1");
//      SimpleString address2 = new SimpleString("add2");
//      SimpleString address3 = new SimpleString("add3");
//      SimpleString address4 = new SimpleString("add4");
//      SimpleString address5 = new SimpleString("add5");
//      Queue q = EasyMock.createStrictMock(Queue.class);
//      Queue q2 = EasyMock.createStrictMock(Queue.class);
//      Queue q3 = EasyMock.createStrictMock(Queue.class);
//      Queue q4 = EasyMock.createStrictMock(Queue.class);
//      Queue q5 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q.getName()).andStubReturn(qName);
//      EasyMock.expect(q2.getName()).andStubReturn(qName2);
//      EasyMock.expect(q3.getName()).andStubReturn(qName3);
//      EasyMock.expect(q4.getName()).andStubReturn(qName4);
//      EasyMock.expect(q5.getName()).andStubReturn(qName5);
//      EasyMock.replay(q, q2, q3, q4, q5);
//      Binding b1 = new QueueBindingImpl(address, q);
//      sam.addBinding(b1);
//      QueueBindingImpl b2 = new QueueBindingImpl(address2, q2);
//      sam.addBinding(b2);
//      QueueBindingImpl b3 = new QueueBindingImpl(address3, q3);
//      sam.addBinding(b3);
//      QueueBindingImpl b4 = new QueueBindingImpl(address4, q4);
//      sam.addBinding(b4);
//      QueueBindingImpl b5 = new QueueBindingImpl(address5, q5);
//      sam.addBinding(b5);
//      assertEquals(sam.getBinding(qName), b1);
//      assertEquals(sam.getBinding(qName2), b2);
//      assertEquals(sam.getBinding(qName3), b3);
//      assertEquals(sam.getBinding(qName4), b4);
//      assertEquals(sam.getBinding(qName5), b5);
//      assertEquals(sam.getBindings().size(), 5);
//      EasyMock.verify(q, q2, q3, q4, q5);
//   }
//
//   public void testRemoveBinding()
//   {
//      SimpleString qName = new SimpleString("q1");
//      SimpleString qName2 = new SimpleString("q2");
//      SimpleString qName3 = new SimpleString("q3");
//      SimpleString qName4 = new SimpleString("q4");
//      SimpleString qName5 = new SimpleString("q5");
//      SimpleString address = new SimpleString("add1");
//      SimpleString address2 = new SimpleString("add2");
//      SimpleString address3 = new SimpleString("add3");
//      SimpleString address4 = new SimpleString("add4");
//      SimpleString address5 = new SimpleString("add5");
//      Queue q = EasyMock.createStrictMock(Queue.class);
//      Queue q2 = EasyMock.createStrictMock(Queue.class);
//      Queue q3 = EasyMock.createStrictMock(Queue.class);
//      Queue q4 = EasyMock.createStrictMock(Queue.class);
//      Queue q5 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q.getName()).andStubReturn(qName);
//      EasyMock.expect(q2.getName()).andStubReturn(qName2);
//      EasyMock.expect(q3.getName()).andStubReturn(qName3);
//      EasyMock.expect(q4.getName()).andStubReturn(qName4);
//      EasyMock.expect(q5.getName()).andStubReturn(qName5);
//      EasyMock.replay(q, q2, q3, q4, q5);
//      QueueBindingImpl b1 = new QueueBindingImpl(address, q);
//      sam.addBinding(b1);
//      QueueBindingImpl b2 = new QueueBindingImpl(address2, q2);
//      sam.addBinding(b2);
//      QueueBindingImpl b3 = new QueueBindingImpl(address3, q3);
//      sam.addBinding(b3);
//      QueueBindingImpl b4 = new QueueBindingImpl(address4, q4);
//      sam.addBinding(b4);
//      QueueBindingImpl b5 = new QueueBindingImpl(address5, q5);
//      sam.addBinding(b5);
//      assertEquals(sam.getBinding(qName), b1);
//      assertEquals(sam.getBinding(qName2), b2);
//      assertEquals(sam.getBinding(qName3), b3);
//      assertEquals(sam.getBinding(qName4), b4);
//      assertEquals(sam.getBinding(qName5), b5);
//      assertEquals(sam.getBindings().size(), 5);
//      sam.removeBinding(qName2);
//      sam.removeBinding(qName4);
//      assertEquals(sam.getBinding(qName), b1);
//      assertNull(sam.getBinding(qName2));
//      assertEquals(sam.getBinding(qName3), b3);
//      assertNull(sam.getBinding(qName4));
//      assertEquals(sam.getBinding(qName5), b5);
//      assertEquals(sam.getBindings().size(), 3);
//      EasyMock.verify(q, q2, q3, q4, q5);
//   }
//
//   public void testAddBindingAlreadyExists()
//   {
//      SimpleString qName = new SimpleString("q1");
//      SimpleString address = new SimpleString("add1");
//      Queue q = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q.getName()).andStubReturn(qName);
//      EasyMock.replay(q);
//      QueueBindingImpl b1 = new QueueBindingImpl(address, q);
//      sam.addBinding(b1);
//      try
//      {
//         sam.addBinding(b1);
//         fail("should throw IllegalStateException");
//      }
//      catch (IllegalStateException e)
//      {
//         //pass
//      }
//      assertEquals(sam.getBinding(qName), b1);
//      EasyMock.verify(q);
//   }
//
//   public void testAddMapping()
//   {
//      SimpleString address = new SimpleString("add1");
//      SimpleString qName = new SimpleString("q1");
//      Queue q = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q.getName()).andStubReturn(qName);
//      QueueBindingImpl b1 = new QueueBindingImpl(address, q);
//      EasyMock.replay(q);
//      sam.addBinding(address, b1);
//      assertNotNull(sam.getBindings(address));
//      assertEquals(sam.getBindings(address).getBindings().size(), 1);
//      assertEquals(sam.getBindings(address).getBindings().get(0), b1);
//      EasyMock.verify(q);
//   }
//
//   public void testRemoveMapping()
//   {
//      SimpleString address = new SimpleString("add1");
//      SimpleString qName = new SimpleString("q1");
//      Queue q = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q.getName()).andStubReturn(qName);
//      QueueBindingImpl b1 = new QueueBindingImpl(address, q);
//      EasyMock.replay(q);
//      sam.addBinding(address, b1);
//      assertNotNull(sam.getBindings(address));
//      assertEquals(sam.getBindings(address).getBindings().size(), 1);
//      assertEquals(sam.getBindings(address).getBindings().get(0), b1);
//      sam.removeMapping(address, qName);
//      assertNull(sam.getBindings(address));      
//      EasyMock.verify(q);
//   }
//
//   public void testAddMultipleBindingsToMapping()
//   {
//      SimpleString address = new SimpleString("add1");
//      SimpleString qName = new SimpleString("q1");
//      SimpleString qName2 = new SimpleString("q2");
//      SimpleString qName3 = new SimpleString("q3");
//      SimpleString qName4 = new SimpleString("q4");
//      SimpleString qName5 = new SimpleString("q5");
//      Queue q = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q.getName()).andStubReturn(qName);
//      Queue q2 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q2.getName()).andStubReturn(qName2);
//      Queue q3 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q3.getName()).andStubReturn(qName3);
//      Queue q4 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q4.getName()).andStubReturn(qName4);
//      Queue q5 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q5.getName()).andStubReturn(qName5);
//      QueueBindingImpl b1 = new QueueBindingImpl(address, q);
//      QueueBindingImpl b2 = new QueueBindingImpl(address, q2);
//      QueueBindingImpl b3 = new QueueBindingImpl(address, q3);
//      QueueBindingImpl b4 = new QueueBindingImpl(address, q4);
//      QueueBindingImpl b5 = new QueueBindingImpl(address, q5);
//      EasyMock.replay(q, q2, q3, q4, q5);
//      sam.addBinding(address, b1);
//      sam.addBinding(address, b2);
//      sam.addBinding(address, b3);
//      sam.addBinding(address, b4);
//      sam.addBinding(address, b5);
//      assertNotNull(sam.getBindings(address));
//      assertEquals(sam.getBindings(address).getBindings().size(), 5);
//      assertEquals(sam.getBindings(address).getBindings().get(0), b1);
//      assertEquals(sam.getBindings(address).getBindings().get(1), b2);
//      assertEquals(sam.getBindings(address).getBindings().get(2), b3);
//      assertEquals(sam.getBindings(address).getBindings().get(3), b4);
//      assertEquals(sam.getBindings(address).getBindings().get(4), b5);
//      EasyMock.verify(q, q2, q3, q4, q5);
//   }
//
//   public void testRemoveMultipleBindingsFromMapping()
//   {
//      SimpleString address = new SimpleString("add1");
//      SimpleString qName = new SimpleString("q1");
//      SimpleString qName2 = new SimpleString("q2");
//      SimpleString qName3 = new SimpleString("q3");
//      SimpleString qName4 = new SimpleString("q4");
//      SimpleString qName5 = new SimpleString("q5");
//      Queue q = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q.getName()).andStubReturn(qName);
//      Queue q2 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q2.getName()).andStubReturn(qName2);
//      Queue q3 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q3.getName()).andStubReturn(qName3);
//      Queue q4 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q4.getName()).andStubReturn(qName4);
//      Queue q5 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q5.getName()).andStubReturn(qName5);
//      QueueBindingImpl b1 = new QueueBindingImpl(address, q);
//      QueueBindingImpl b2 = new QueueBindingImpl(address, q2);
//      QueueBindingImpl b3 = new QueueBindingImpl(address, q3);
//      QueueBindingImpl b4 = new QueueBindingImpl(address, q4);
//      QueueBindingImpl b5 = new QueueBindingImpl(address, q5);
//      EasyMock.replay(q, q2, q3, q4, q5);
//      sam.addBinding(address, b1);
//      sam.addBinding(address, b2);
//      sam.addBinding(address, b3);
//      sam.addBinding(address, b4);
//      sam.addBinding(address, b5);
//      assertNotNull(sam.getBindings(address));
//      assertEquals(sam.getBindings(address).getBindings().size(), 5);
//      assertEquals(sam.getBindings(address).getBindings().get(0), b1);
//      assertEquals(sam.getBindings(address).getBindings().get(1), b2);
//      assertEquals(sam.getBindings(address).getBindings().get(2), b3);
//      assertEquals(sam.getBindings(address).getBindings().get(3), b4);
//      assertEquals(sam.getBindings(address).getBindings().get(4), b5);
//      sam.removeMapping(address, qName2);
//      sam.removeMapping(address, qName4);
//      assertNotNull(sam.getBindings(address));
//      assertEquals(sam.getBindings(address).getBindings().size(), 3);
//      assertEquals(sam.getBindings(address).getBindings().get(0), b1);
//      assertEquals(sam.getBindings(address).getBindings().get(1), b3);
//      assertEquals(sam.getBindings(address).getBindings().get(2), b5);
//      EasyMock.verify(q, q2, q3, q4, q5);
//   }
//
//   public void testAddBindingsToMultipleMappings()
//   {
//      SimpleString address = new SimpleString("add1");
//      SimpleString address2 = new SimpleString("add2");
//      SimpleString address3 = new SimpleString("add3");
//      SimpleString address4 = new SimpleString("add4");
//      SimpleString address5 = new SimpleString("add5");
//      SimpleString qName = new SimpleString("q1");
//      SimpleString qName2 = new SimpleString("q2");
//      SimpleString qName3 = new SimpleString("q3");
//      SimpleString qName4 = new SimpleString("q4");
//      SimpleString qName5 = new SimpleString("q5");
//      Queue q = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q.getName()).andStubReturn(qName);
//      Queue q2 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q2.getName()).andStubReturn(qName2);
//      Queue q3 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q3.getName()).andStubReturn(qName3);
//      Queue q4 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q4.getName()).andStubReturn(qName4);
//      Queue q5 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q5.getName()).andStubReturn(qName5);
//      QueueBindingImpl b1 = new QueueBindingImpl(address, q);
//      QueueBindingImpl b2 = new QueueBindingImpl(address2, q2);
//      QueueBindingImpl b3 = new QueueBindingImpl(address3, q3);
//      QueueBindingImpl b4 = new QueueBindingImpl(address4, q4);
//      QueueBindingImpl b5 = new QueueBindingImpl(address5, q5);
//      EasyMock.replay(q, q2, q3, q4, q5);
//      sam.addBinding(address, b1);
//      sam.addBinding(address2, b2);
//      sam.addBinding(address3, b3);
//      sam.addBinding(address4, b4);
//      sam.addBinding(address5, b5);
//      assertNotNull(sam.getBindings(address));
//      assertEquals(sam.getBindings(address).getBindings().size(), 1);
//      assertEquals(sam.getBindings(address).getBindings().get(0), b1);
//      assertNotNull(sam.getBindings(address2));
//      assertEquals(sam.getBindings(address2).getBindings().size(), 1);
//      assertEquals(sam.getBindings(address2).getBindings().get(0), b2);
//      assertNotNull(sam.getBindings(address3));
//      assertEquals(sam.getBindings(address3).getBindings().size(), 1);
//      assertEquals(sam.getBindings(address3).getBindings().get(0), b3);
//      assertNotNull(sam.getBindings(address4));
//      assertEquals(sam.getBindings(address4).getBindings().size(), 1);
//      assertEquals(sam.getBindings(address4).getBindings().get(0), b4);
//      assertNotNull(sam.getBindings(address5));
//      assertEquals(sam.getBindings(address5).getBindings().size(), 1);
//      assertEquals(sam.getBindings(address5).getBindings().get(0), b5);
//      EasyMock.verify(q, q2, q3, q4, q5);
//   }
//
//   public void testRemoveBindingsFromMultipleMappings()
//   {
//      SimpleString address = new SimpleString("add1");
//      SimpleString address2 = new SimpleString("add2");
//      SimpleString address3 = new SimpleString("add3");
//      SimpleString address4 = new SimpleString("add4");
//      SimpleString address5 = new SimpleString("add5");
//      SimpleString qName = new SimpleString("q1");
//      SimpleString qName2 = new SimpleString("q2");
//      SimpleString qName3 = new SimpleString("q3");
//      SimpleString qName4 = new SimpleString("q4");
//      SimpleString qName5 = new SimpleString("q5");
//      Queue q = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q.getName()).andStubReturn(qName);
//      Queue q2 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q2.getName()).andStubReturn(qName2);
//      Queue q3 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q3.getName()).andStubReturn(qName3);
//      Queue q4 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q4.getName()).andStubReturn(qName4);
//      Queue q5 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q5.getName()).andStubReturn(qName5);
//      QueueBindingImpl b1 = new QueueBindingImpl(address, q);
//      QueueBindingImpl b2 = new QueueBindingImpl(address2, q2);
//      QueueBindingImpl b3 = new QueueBindingImpl(address3, q3);
//      QueueBindingImpl b4 = new QueueBindingImpl(address4, q4);
//      QueueBindingImpl b5 = new QueueBindingImpl(address5, q5);
//      EasyMock.replay(q, q2, q3, q4, q5);
//      sam.addBinding(address, b1);
//      sam.addBinding(address2, b2);
//      sam.addBinding(address3, b3);
//      sam.addBinding(address4, b4);
//      sam.addBinding(address5, b5);
//      assertNotNull(sam.getBindings(address));
//      assertEquals(sam.getBindings(address).getBindings().size(), 1);
//      assertEquals(sam.getBindings(address).getBindings().get(0), b1);
//      assertNotNull(sam.getBindings(address2));
//      assertEquals(sam.getBindings(address2).getBindings().size(), 1);
//      assertEquals(sam.getBindings(address2).getBindings().get(0), b2);
//      assertNotNull(sam.getBindings(address3));
//      assertEquals(sam.getBindings(address3).getBindings().size(), 1);
//      assertEquals(sam.getBindings(address3).getBindings().get(0), b3);
//      assertNotNull(sam.getBindings(address4));
//      assertEquals(sam.getBindings(address4).getBindings().size(), 1);
//      assertEquals(sam.getBindings(address4).getBindings().get(0), b4);
//      assertNotNull(sam.getBindings(address5));
//      assertEquals(sam.getBindings(address5).getBindings().size(), 1);
//      assertEquals(sam.getBindings(address5).getBindings().get(0), b5);
//      sam.removeMapping(address2, qName2);
//      sam.removeMapping(address4, qName4);
//      assertNotNull(sam.getBindings(address));
//      assertEquals(sam.getBindings(address).getBindings().size(), 1);
//      assertEquals(sam.getBindings(address).getBindings().get(0), b1);
//      assertNull(sam.getBindings(address2)); 
//      assertEquals(sam.getBindings(address3).getBindings().size(), 1);
//      assertEquals(sam.getBindings(address3).getBindings().get(0), b3);
//      assertNull(sam.getBindings(address4)); 
//      assertEquals(sam.getBindings(address5).getBindings().size(), 1);
//      assertEquals(sam.getBindings(address5).getBindings().get(0), b5);
//      EasyMock.verify(q, q2, q3, q4, q5);
//   }
//
//   public void testAddMultipleBindingsToMultipleMappings()
//   {
//      SimpleString address = new SimpleString("add1");
//      SimpleString address2 = new SimpleString("add2");
//      SimpleString address3 = new SimpleString("add3");
//      SimpleString address4 = new SimpleString("add4");
//      SimpleString address5 = new SimpleString("add5");
//      SimpleString address6 = new SimpleString("add6");
//      SimpleString address7 = new SimpleString("add7");
//      SimpleString address8 = new SimpleString("add8");
//      SimpleString address9 = new SimpleString("add9");
//      SimpleString address10 = new SimpleString("add105");
//      SimpleString qName = new SimpleString("q1");
//      SimpleString qName2 = new SimpleString("q2");
//      SimpleString qName3 = new SimpleString("q3");
//      SimpleString qName4 = new SimpleString("q4");
//      SimpleString qName5 = new SimpleString("q5");
//      SimpleString qName6 = new SimpleString("q6");
//      SimpleString qName7 = new SimpleString("q7");
//      SimpleString qName8 = new SimpleString("q8");
//      SimpleString qName9 = new SimpleString("q9");
//      SimpleString qName10 = new SimpleString("q10");
//      Queue q = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q.getName()).andStubReturn(qName);
//      Queue q2 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q2.getName()).andStubReturn(qName2);
//      Queue q3 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q3.getName()).andStubReturn(qName3);
//      Queue q4 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q4.getName()).andStubReturn(qName4);
//      Queue q5 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q5.getName()).andStubReturn(qName5);
//      Queue q6 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q6.getName()).andStubReturn(qName6);
//      Queue q7 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q7.getName()).andStubReturn(qName7);
//      Queue q8 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q8.getName()).andStubReturn(qName8);
//      Queue q9 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q9.getName()).andStubReturn(qName9);
//      Queue q10 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q10.getName()).andStubReturn(qName10);
//      QueueBindingImpl b1 = new QueueBindingImpl(address, q);
//      QueueBindingImpl b2 = new QueueBindingImpl(address2, q2);
//      QueueBindingImpl b3 = new QueueBindingImpl(address3, q3);
//      QueueBindingImpl b4 = new QueueBindingImpl(address4, q4);
//      QueueBindingImpl b5 = new QueueBindingImpl(address5, q5);
//      QueueBindingImpl b6 = new QueueBindingImpl(address6, q6);
//      QueueBindingImpl b7 = new QueueBindingImpl(address7, q7);
//      QueueBindingImpl b8 = new QueueBindingImpl(address8, q8);
//      QueueBindingImpl b9 = new QueueBindingImpl(address9, q9);
//      QueueBindingImpl b10 = new QueueBindingImpl(address10, q10);
//      EasyMock.replay(q);
//      sam.addBinding(address, b1);
//      sam.addBinding(address2, b2);
//      sam.addBinding(address, b3);
//      sam.addBinding(address2, b4);
//      sam.addBinding(address, b5);
//      sam.addBinding(address2, b6);
//      sam.addBinding(address, b7);
//      sam.addBinding(address2, b8);
//      sam.addBinding(address, b9);
//      sam.addBinding(address2, b10);
//      assertNotNull(sam.getBindings(address));
//      assertEquals(sam.getBindings(address).getBindings().size(), 5);
//      assertEquals(sam.getBindings(address).getBindings().get(0), b1);
//      assertEquals(sam.getBindings(address).getBindings().get(1), b3);
//      assertEquals(sam.getBindings(address).getBindings().get(2), b5);
//      assertEquals(sam.getBindings(address).getBindings().get(3), b7);
//      assertEquals(sam.getBindings(address).getBindings().get(4), b9);
//      assertNotNull(sam.getBindings(address2));
//      assertEquals(sam.getBindings(address2).getBindings().size(), 5);
//      assertEquals(sam.getBindings(address2).getBindings().get(0), b2);
//      assertEquals(sam.getBindings(address2).getBindings().get(1), b4);
//      assertEquals(sam.getBindings(address2).getBindings().get(2), b6);
//      assertEquals(sam.getBindings(address2).getBindings().get(3), b8);
//      assertEquals(sam.getBindings(address2).getBindings().get(4), b10);
//      EasyMock.verify(q);
//   }
//
//   public void testRemoveMultipleBindingsTFromMultipleMappings()
//   {
//      SimpleString address = new SimpleString("add1");
//      SimpleString address2 = new SimpleString("add2");
//      SimpleString address3 = new SimpleString("add3");
//      SimpleString address4 = new SimpleString("add4");
//      SimpleString address5 = new SimpleString("add5");
//      SimpleString address6 = new SimpleString("add6");
//      SimpleString address7 = new SimpleString("add7");
//      SimpleString address8 = new SimpleString("add8");
//      SimpleString address9 = new SimpleString("add9");
//      SimpleString address10 = new SimpleString("add105");
//      SimpleString qName = new SimpleString("q1");
//      SimpleString qName2 = new SimpleString("q2");
//      SimpleString qName3 = new SimpleString("q3");
//      SimpleString qName4 = new SimpleString("q4");
//      SimpleString qName5 = new SimpleString("q5");
//      SimpleString qName6 = new SimpleString("q6");
//      SimpleString qName7 = new SimpleString("q7");
//      SimpleString qName8 = new SimpleString("q8");
//      SimpleString qName9 = new SimpleString("q9");
//      SimpleString qName10 = new SimpleString("q10");
//      Queue q = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q.getName()).andStubReturn(qName);
//      Queue q2 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q2.getName()).andStubReturn(qName2);
//      Queue q3 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q3.getName()).andStubReturn(qName3);
//      Queue q4 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q4.getName()).andStubReturn(qName4);
//      Queue q5 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q5.getName()).andStubReturn(qName5);
//      Queue q6 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q6.getName()).andStubReturn(qName6);
//      Queue q7 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q7.getName()).andStubReturn(qName7);
//      Queue q8 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q8.getName()).andStubReturn(qName8);
//      Queue q9 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q9.getName()).andStubReturn(qName9);
//      Queue q10 = EasyMock.createStrictMock(Queue.class);
//      EasyMock.expect(q10.getName()).andStubReturn(qName10);
//      QueueBindingImpl b1 = new QueueBindingImpl(address, q);
//      QueueBindingImpl b2 = new QueueBindingImpl(address2, q2);
//      QueueBindingImpl b3 = new QueueBindingImpl(address3, q3);
//      QueueBindingImpl b4 = new QueueBindingImpl(address4, q4);
//      QueueBindingImpl b5 = new QueueBindingImpl(address5, q5);
//      QueueBindingImpl b6 = new QueueBindingImpl(address6, q6);
//      QueueBindingImpl b7 = new QueueBindingImpl(address7, q7);
//      QueueBindingImpl b8 = new QueueBindingImpl(address8, q8);
//      QueueBindingImpl b9 = new QueueBindingImpl(address9, q9);
//      QueueBindingImpl b10 = new QueueBindingImpl(address10, q10);
//      EasyMock.replay(q, q2, q3, q4, q5);
//      sam.addBinding(address, b1);
//      sam.addBinding(address2, b2);
//      sam.addBinding(address, b3);
//      sam.addBinding(address2, b4);
//      sam.addBinding(address, b5);
//      sam.addBinding(address2, b6);
//      sam.addBinding(address, b7);
//      sam.addBinding(address2, b8);
//      sam.addBinding(address, b9);
//      sam.addBinding(address2, b10);
//      assertNotNull(sam.getBindings(address));
//      assertEquals(sam.getBindings(address).getBindings().size(), 5);
//      assertEquals(sam.getBindings(address).getBindings().get(0), b1);
//      assertEquals(sam.getBindings(address).getBindings().get(1), b3);
//      assertEquals(sam.getBindings(address).getBindings().get(2), b5);
//      assertEquals(sam.getBindings(address).getBindings().get(3), b7);
//      assertEquals(sam.getBindings(address).getBindings().get(4), b9);
//      assertNotNull(sam.getBindings(address2));
//      assertEquals(sam.getBindings(address2).getBindings().size(), 5);
//      assertEquals(sam.getBindings(address2).getBindings().get(0), b2);
//      assertEquals(sam.getBindings(address2).getBindings().get(1), b4);
//      assertEquals(sam.getBindings(address2).getBindings().get(2), b6);
//      assertEquals(sam.getBindings(address2).getBindings().get(3), b8);
//      assertEquals(sam.getBindings(address2).getBindings().get(4), b10);
//
//      sam.removeMapping(address, qName3);
//      sam.removeMapping(address, qName5);
//      sam.removeMapping(address2, qName2);
//      sam.removeMapping(address2, qName4);
//      assertNotNull(sam.getBindings(address));
//      assertEquals(sam.getBindings(address).getBindings().size(), 3);
//      assertEquals(sam.getBindings(address).getBindings().get(0), b1);
//      assertEquals(sam.getBindings(address).getBindings().get(1), b7);
//      assertEquals(sam.getBindings(address).getBindings().get(2), b9);
//      assertNotNull(sam.getBindings(address2));
//      assertEquals(sam.getBindings(address2).getBindings().size(), 3);
//      assertEquals(sam.getBindings(address2).getBindings().get(0), b6);
//      assertEquals(sam.getBindings(address2).getBindings().get(1), b8);
//      assertEquals(sam.getBindings(address2).getBindings().get(2), b10);
//      EasyMock.verify(q, q2, q3, q4, q5);
//   }
   
   public void testFoo()
   {      
   }
}
