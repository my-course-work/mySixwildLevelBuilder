package application.Controllers.EditLevelScreen.StarMilestonePreference;

import application.Controllers.EditLevelScreen.ChangePreferenceController;
import application.Models.Levels.Level;
import application.Views.Screens.EditLevelScreenPackage.EditLevelScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by harryliu on 5/19/15.
 */
public class ChangeOneStarMilestoneController extends ChangePreferenceController {

    public ChangeOneStarMilestoneController(EditLevelScreen editLevelScreen, JTextField numberTextField) {
        super(editLevelScreen, numberTextField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Level level = editLevelScreen.getLevel();

        try {
            long milestone = Long.parseLong(numberTextField.getText());
            level.getScore().getOneStarScore().setValue(milestone);
        } catch (Exception ex) {
            editLevelScreen.getLevelPreferencePanel().getStarMilestonePanel().modelChanged();
        }
    }
}
