/*
 * TCSS 305 Autumn 2018
 * Assignment 6
 */

package view;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This is the class that handles
 * the score panel for the Tetris
 * game.
 * 
 * @author Michael Zachary Loria
 * @version December 3 2018
 */
public class GUIScorePanel extends JPanel implements PropertyChangeListener
{
    /** A generated serial ID. */
    private static final long serialVersionUID = -1500113179026395816L;
    
    /** The number of lines in each level. */
    private static final double LINES_PER_LEVEL = 5.0;
    
    /** Score mutiplier per line cleared. */
    private static final int SCORE_MULTIPLIER = 40;
    
    /** The lines cleared string. */
    private static final String LINES_CLEARED = "   Lines Cleared: ";
    
    /** The current level string. */
    private static final String CURRENT_LEVEL = "   Current Level: ";
    
    /** The score string. */
    private static final String SCORE = "   Score: ";
    
    /** The lines until level up string. */
    private static final String LINES_LEVEL_UP = "   Lines Until Level Up: ";
    
    /** The title of the score panel. */
    private final JLabel myTitle;
    
    /** The label for the scores. */
    private final JLabel myScore;
    
    /** The label for the lines cleared. */
    private final JLabel myLines;
    
    /** The label for the levels. */
    private final JLabel myLevel;
    
    /** The label for the lines until level up. */
    private final JLabel myLinesLevelUp;
    
    /** The integer representing the score. */
    private int myScoreNum;
    
    /** The integer representing the lines cleared. */
    private int myLineNum;
    
    /** The integer representing how many more lines until level up. */
    private int myLevelUpNum;
    
    /** The integer representing the number of levels cleared. */
    private int myLevelNum;
    
    /** The tetris panel. */
    private final GUITetrisPanel myTetrisPanel;
    
    /**
     * Initializes the fields for the
     * scoring panel.
     * 
     * @param theTetrisPanel The tetris panel.
     */
    public GUIScorePanel(final GUITetrisPanel theTetrisPanel)
    {
        myTetrisPanel = theTetrisPanel;
        myTetrisPanel.addPropertyChangeListener(this);
        myTitle = new JLabel("          Tetris Score Board          ");
        myScore = new JLabel(SCORE + 0);
        myLines = new JLabel(LINES_CLEARED + 0);
        myLinesLevelUp = new JLabel(LINES_LEVEL_UP + (int) LINES_PER_LEVEL);
        myLevel = new JLabel(CURRENT_LEVEL + 1);
        setUp();
    }
    
    /**
     * Sets up the panel by adding the
     * components to the panel.
     */
    private void setUp()
    {
        myScoreNum = 0;
        myLineNum = 0;
        myLevelNum = 1;
        myLevelUpNum = 0;
        myTitle.setHorizontalAlignment(JLabel.CENTER);
        add(myTitle);
        add(myScore);
        add(myLines);
        add(myLinesLevelUp);
        add(myLevel);
    }
    
    /**
     * Changes the number of lines cleared, lines
     * until next level up, and score if appropriate. 
     * 
     * @param theLineNum The number of lines cleared that round. 
     */
    public void changeLine(final int theLineNum)
    {
        if (myLineNum != myLineNum + theLineNum)
        {
            myLineNum = myLineNum + theLineNum;
            myLines.setText(LINES_CLEARED + myLineNum);
            if (myLineNum / (int) LINES_PER_LEVEL == myLevelNum)
            {
                myLevelNum = myLevelNum + 1;
                myLevel.setText(CURRENT_LEVEL + myLevelNum);
                myTetrisPanel.speedUp();
            }
            myLevelUpNum = (int) LINES_PER_LEVEL - (myLineNum % (int) LINES_PER_LEVEL);
            changeScore(theLineNum * SCORE_MULTIPLIER * myLevelNum);
            myLinesLevelUp.setText(LINES_LEVEL_UP + myLevelUpNum);
        }
    }
    
    /**
     * Changes the score appropriately.
     * 
     * @param theScoreNum The score to add to the current score.
     */
    private void changeScore(final int theScoreNum)
    {
        myScoreNum = myScoreNum + theScoreNum;
        myScore.setText(SCORE + myScoreNum);
    }
    
    @Override
    public void propertyChange(final PropertyChangeEvent theEvent)
    {
        if (theEvent.getPropertyName().equals("New Game"))
        {
            myScoreNum = 0;
            myLineNum = 0;
            myLevelNum = 1;
            myLevelUpNum = 0;
            myLines.setText(LINES_CLEARED + myLineNum);
            myLevel.setText(CURRENT_LEVEL + myLevelNum);
            myLinesLevelUp.setText(LINES_LEVEL_UP + myLevelUpNum);
            myScore.setText(SCORE + myScoreNum);
            
        }
    }
}
