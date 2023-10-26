import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecentlyPlayedStoreTest {
    @Test
    public void testRecentlyPlayedSongs() {
        RecentlyPlayedStore store = new RecentlyPlayedStore(3);

        store.addSong("user1", "S1");
        store.addSong("user1", "S2");
        store.addSong("user1", "S3");

        assertEquals(List.of("S1", "S2", "S3"), store.getRecentlyPlayedSongs("user1"));

        store.addSong("user1", "S4");
        assertEquals(List.of("S2", "S3", "S4"), store.getRecentlyPlayedSongs("user1"));

        store.addSong("user1", "S2");
        assertEquals(List.of("S3", "S4", "S2"), store.getRecentlyPlayedSongs("user1"));

        store.addSong("user1", "S1");
        assertEquals(List.of("S4", "S2", "S1"), store.getRecentlyPlayedSongs("user1"));
    }
}
