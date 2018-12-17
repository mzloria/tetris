/*
 * TCSS 305 Autumn 2018
 * Assignment 6
 */

package view;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import model.Board;

/**
 * The key adapter used by the Tetris
 * game.
 * 
 * @author Michael Zachary Loria
 * @version December 3 2018
 */
public class TetrisKeyAdapter extends KeyAdapter
{
    /** The board where the game is played on. */
    private final Board myBoard;
    
    /** The tetris panel. */
    private GUITetrisPanel myTetrisPanel;
    
    /**
     * Initializes the board and the panel needed
     * for the key adapter.
     * 
     * @param theBoard The board where the game is played on.
     * @param theTetrisPanel The panel where the Tetris game is played on.
     */
    public TetrisKeyAdapter(final Board theBoard, final GUITetrisPanel theTetrisPanel)
    {
        myTetrisPanel = theTetrisPanel;
        myBoard = theBoard;
    }
    
    @Override
    public void keyPressed(final KeyEvent theEvent)
    {
        if (!myTetrisPanel.getState())
        {
            return;
        }
        leftRightKeys(theEvent);
        upDownSpaceKeys(theEvent);
    }
    
    /**
     * Checks if the left/a or right/d keys were pressed
     * based on the event. 
     * 
     * @param theEvent The event that occurred.
     */
    private void leftRightKeys(final KeyEvent theEvent)
    {
        if (theEvent.getKeyCode() == KeyEvent.VK_A
                        || theEvent.getKeyCode() == KeyEvent.VK_LEFT)
        {
            myBoard.left();
        }
        else if (theEvent.getKeyCode() == KeyEvent.VK_D
                        || theEvent.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            myBoard.right();
        }
    }
    
    /**
     * Checks if the up/w or down/s or space keys were pressed
     * based on the event. 
     * 
     * @param theEvent The event that occurred.
     */
    private void upDownSpaceKeys(final KeyEvent theEvent)
    {
        if (theEvent.getKeyCode() == KeyEvent.VK_W
                        || theEvent.getKeyCode() == KeyEvent.VK_UP)
        {
            myBoard.rotate();
        }
        else if (theEvent.getKeyCode() == KeyEvent.VK_S
                        || theEvent.getKeyCode() == KeyEvent.VK_DOWN)
        {
            myBoard.down();
        }
        else if (theEvent.getKeyCode() == KeyEvent.VK_SPACE)
        {
            myBoard.drop();
        }
    }
    
}
