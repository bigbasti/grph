/*
 * (C) Copyright 2009-2013 CNRS.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:

    Luc Hogie (CNRS, I3S laboratory, University of Nice-Sophia Antipolis) 
    Aurelien Lancin (Coati research team, Inria)
    Christian Glacet (LaBRi, Bordeaux)
    David Coudert (Coati research team, Inria)
    Fabien Crequis (Coati research team, Inria)
    Grégory Morel (Coati research team, Inria)
    Issam Tahiri (Coati research team, Inria)
    Julien Fighiera (Aoste research team, Inria)
    Laurent Viennot (Gang research-team, Inria)
    Michel Syska (I3S, University of Nice-Sophia Antipolis)
    Nathann Cohen (LRI, Saclay) 
 */
 
 package grph.script;

import grph.Grph;

import java4unix.CommandLine;

import toools.thread.Threads;



public class render_graphstream extends AbstractGraphOperation
{


	@Override
	public int runScript(CommandLine cmdLine, Grph graph) throws Throwable
	{
		graph.display();
		Threads.sleepForever();
		return 0;
	}

	@Override
	public String getShortDescription()
	{
		return "Render the given graph using Graphstream. Since Graphstream does not support hyper-edges, half-edges" +
				"and loose edges, these will not be rendered properly.";
	}

	public static void main(String[] args) throws Throwable
	{
		new render_graphstream().run("/Users/lhogie/tmp/test.dc");
	}
}
