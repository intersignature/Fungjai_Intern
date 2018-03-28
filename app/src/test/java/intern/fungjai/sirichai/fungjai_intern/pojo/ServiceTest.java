package intern.fungjai.sirichai.fungjai_intern.pojo;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import intern.fungjai.sirichai.fungjai_intern.api.FungjaiInternApiManager;
import intern.fungjai.sirichai.fungjai_intern.api.Service;

import static junit.framework.Assert.assertEquals;

public class ServiceTest {

    @Test
    public void resultSizeTest() throws IOException {
        Service service = FungjaiInternApiManager.getFungjaiInternApi();
        List<MusicData> musicListData = service.getMusicList().execute().body();
        assert musicListData != null;
        assertEquals(8, musicListData.size());
    }
}
