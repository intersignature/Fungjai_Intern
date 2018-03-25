package intern.fungjai.sirichai.fungjai_intern.model.pojo;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import intern.fungjai.sirichai.fungjai_intern.model.api.FungjaiInternApiManager;
import intern.fungjai.sirichai.fungjai_intern.model.api.Service;

import static junit.framework.Assert.assertEquals;

public class ServiceTest {

    @Test
    public void resultSizeTest() throws IOException {
        Service service = FungjaiInternApiManager.getFungjaiInternApi();
        List<DataModel> dataModelList = service.getMusicList().execute().body();
        assert dataModelList != null;
        assertEquals(8, dataModelList.size());
    }
}
