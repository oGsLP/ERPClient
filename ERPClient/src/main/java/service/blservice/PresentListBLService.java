package service.blservice;

import objects.ResultMessage;
import vo.PresentListVO;

import java.util.ArrayList;

public interface PresentListBLService {
    /**
     *
     * @param vo
     * @return
     */
    public ResultMessage addPresentList(PresentListVO vo);

    /**
     *
     * @param vo
     * @return
     */
    public ResultMessage deletePresentList(PresentListVO vo);

    /**
     *
     * @param vo
     * @return
     */
    public ResultMessage update(PresentListVO vo);


    /**
     * 查找并得到赠送单
     * @param startTime
     * @param endTime
     * @param userName
     * @param memberName
     * @return
     */
    public ArrayList<PresentListVO> getOverflowList(String startTime, String endTime, String userName, String memberName);

    /**
     * 生成红冲
     * @param vo
     * @return
     */
    public PresentListVO addPresentListRed(PresentListVO vo);
}
