/*
 * TCSS 305 Autumn 2018
 * Assignment 6
 */

package view;

import java.awt.EventQueue;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * This class starts the Tetris game.
 * 
 * @author Michael Zachary Loria
 * @version December 3 2018
 */
public final class Driver
{
    /**
     * This is a private constructor to prevent external instantiation.
     */
    private Driver()
    {
        throw new IllegalStateException();
    }

    /**
     * This method sets the look and feel of the graphical user interface.
     */
    private static void setLookAndFeel()
    {
        try
        {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        }
        catch (final UnsupportedLookAndFeelException e)
        {
            System.out.println("UnsupportedLookAndFeelException");
        }
        catch (final ClassNotFoundException e)
        {
            System.out.println("ClassNotFoundException");
        }
        catch (final InstantiationException e)
        {
            System.out.println("InstantiationException");
        }
        catch (final IllegalAccessException e)
        {
            System.out.println("IllegalAccessException");
        }
    }

    /**
     * This is the starting point for the Tetris program.
     * 
     * @param theArgs Command line arguments.
     */
    public static void main(final String[] theArgs)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                setLookAndFeel();
                new GUI().setUp();
            }
        });
    }
}
