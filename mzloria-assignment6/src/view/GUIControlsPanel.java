/*
 * TCSS 305 Autumn 2018
 * Assignment 6
 */

package view;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This is the class that handles
 * the control panel for the Tetris
 * game.
 * 
 * @author Michael Zachary Loria
 * @version December 3 2018
 */
public class GUIControlsPanel extends JPanel
{
    /** A generated serial ID. */
    private static final long serialVersionUID = 8739356720270547600L;
    
    /** The number of rows in this panel. */
    private static final int NUM_ROWS = 11;
    
    /**
     * Sets up the control panel.
     */
    public GUIControlsPanel()
    {
        setLayout(new GridLayout(NUM_ROWS, 1));
        setUpControlsPanel();
    }
    
    /**
     * Adds the necessary components to the panel.
     */
    private void setUpControlsPanel()
    {
        final JLabel keyboardShortcuts = new JLabel("Keyboard Shortcuts");
        keyboardShortcuts.setHorizontalAlignment(JLabel.CENTER);
        add(keyboardShortcuts);
        add(new JLabel("    New Game: 'n'"));
        add(new JLabel("    Pause/Resume Game: 'p'"));
        add(new JLabel("    End Game: 'e'"));
        add(new JLabel(" "));
        final JLabel gameControls = new JLabel("Game Controls");
        gameControls.setHorizontalAlignment(JLabel.CENTER);
        add(gameControls);
        add(new JLabel("    Move Left: Left Arrow or 'a'"));
        add(new JLabel("    Move Right: Right Arrow or 'd'"));
        add(new JLabel("    Move Down: Down Arrow or 's'"));
        add(new JLabel("    Rotate: Up Arrow or 'w'"));
        add(new JLabel("    Drop: Space")); 
    }
}
