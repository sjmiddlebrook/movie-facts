package com.jackmiddlebrook.pixarmoviefacts;

/**
 * Gets the next fact from the list of facts.
 * Created by jackmiddlebrook on 10/5/14.
 */
public class FactBook {

    // Member Variables
    private int mIndex = 0;

    private String[] mFacts = {
            "In November 1993, reels of Toy Story were brought in front of " +
            "Disney executives who decided to halt production and nearly gave " +
            "up on the project.Three months later, Pixar came back with a " +
            "reworked script and the film was saved.",
            "A Bug's Life is based off Aesop's fable The Ant and the Grasshopper.",
            "Toy Story 2 was originally going to be a direct-to-video release. After Disney saw the " +
            "reels, it was changed to a full length theatrical film. It is now considered one of " +
            "the best animated films of all-time.",
            "Billy Crystal, the voice of Mike Wazowski in Monster's Inc., was originally offered the role of Buzz " +
            "Lightyear in Toy Story but declined.",
            "Finding Nemo director Andrew Stanton is the voice of Crush the sea turtle. Originally doing the voice " +
            "as a stand in, Stanton thought they would eventually find an actor but his voice proved popular " +
            "in test screenings and stayed in the film.",
            "The Incredibles story was influenced by director Brad Bird's own struggles balancing his " +
            "career goals and family life.",
            "Cars was inspired by Director John Lasseter's own road trip across the country with his family.",
            "Pet rats were kept in the hallway of Pixar for over a year during production of Ratatouille so the artists could more accurately depict " +
            "rat movements and behaviors in the film.",
            "The robots in WALL-E all follow science fiction author Isaav Asimov's Three Laws of Robotics.",
            "It was estimated that 23 million balloons would be needed to make Carl's house fly in " +
            "Up. To avoid the balloons looking too small, the number of balloons depicted range from around 10,000 to 20,000.",
            "The final scene of Toy Story 3 is of white clouds against a blue sky, the same backdrop as the opening scene of " +
            "original Toy Story that shows the wallpaper of Andy's room.",
            "The idea for Cars 2 came from director John Lasseter's experience travelling around the world promoting the original " +
            "Cars movie and wondering what Mater would do in the different countries.",
            "The hard to understand dialect of Young MacGuffin in Brave is actually a Doric dialect spoken in northeastern Scotland.",
            "The campus of Monsters University was inspired by the campuses of UC Berkeley, Stanford, Harvard and MIT."
    };

    // Methods
    public String getFact() {

        String fact;
        // Increment the fact and movie index
        mIndex++;

        fact = mFacts[mIndex % mFacts.length];

        return fact;

    }
}
