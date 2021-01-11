package lsl.rpc.server;

import lsl.rpc.ByeService;
import lsl.rpc.annotation.Service;

/**
 *
 */
@Service
public class ByeServiceImpl implements ByeService {

    @Override
    public String bye(String name) {
        return "bye, " + name;
    }
}
