package events;

import events.engine.FlipDownCardsEvent;
import events.engine.GameWonEvent;
import events.engine.HidePairCardsEvent;
import events.ui.BackGameEvent;
import events.ui.DifficultySelectedEvent;
import events.ui.FlipCardEvent;
import events.ui.NextGameEvent;
import events.ui.ResetBackgroundEvent;
import events.ui.StartEvent;
import events.ui.ThemeSelectedEvent;


public interface EventObserver {

	void onEvent(FlipCardEvent event);

	void onEvent(DifficultySelectedEvent event);

	void onEvent(HidePairCardsEvent event);

	void onEvent(FlipDownCardsEvent event);

	void onEvent(StartEvent event);

	void onEvent(ThemeSelectedEvent event);

	void onEvent(GameWonEvent event);

	void onEvent(BackGameEvent event);

	void onEvent(NextGameEvent event);

	void onEvent(ResetBackgroundEvent event);

}
