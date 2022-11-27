package com.example.myapplication.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.R;
import com.example.myapplication.activity.MoTaDoiBong;
import com.example.myapplication.doibong.adapter.DoiBongAdapterHome;
import com.example.myapplication.doibong.adapter.DoiBongViewPagerAdapter;
import com.example.myapplication.doibong.model.DoiBong1;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class FragmentTrangChu extends Fragment {

    final String psg="Câu lạc bộ bóng đá Paris Saint-Germain (thường được gọi là Paris Saint-Germain, Paris SG hoặc đơn giản là PSG) là một câu lạc bộ bóng đá chuyên nghiệp có trụ sở tại Paris, Pháp. Tiền thân là câu lạc bộ đa thể thao Stade Saint-Germain, Paris Saint-Germain chính thức được thành lập năm 1970 và hiện đang thi đấu tại Ligue 1.Tại hạng đấu cao nhất của bóng đá Pháp, Paris Saint-Germain có 10 lần giành chức vô địch của giải đấu. Câu lạc bộ cũng có 9 lần giữ vị trí á quân, trong đó có mùa bóng 1992–1993, Paris Saint-Germain từ chối chức vô địch sau khi Olympique de Marseille bị tước danh hiệu vì scandal. Với các giải đá cúp, câu lạc bộ có rất nhiều thành tích với 14 lần giành Cúp bóng đá Pháp, 9 lần giành Cúp Liên đoàn bóng đá Pháp và 10 lần Siêu cúp bóng đá Pháp. Trên đấu trường châu Âu, thành tích lớn nhất mà Paris Saint-Germain đạt được là danh hiệu UEFA Cup Winners' Cup vào năm 1996 và 1 lần về nhì ở UEFA Champions League. Trang phục thi đấu của Paris Saint-Germain mang hai màu xanh, đỏ chủ đạo, cũng chính là màu cờ của thành phố Paris. Sân nhà của câu lạc bộ hiện tại là Sân vận động Công viên các Hoàng tử, nằm tại Quận 16, kế bên rừng Boulogne, có sức chứa 47.929 chỗ ngồi.";
    final String mu="Câu lạc bộ bóng đá Manchester United (tiếng Anh: Manchester United Football Club, hay ngắn gọn là MU hay Man Utd) là một câu lạc bộ bóng đá chuyên nghiệp có trụ sở tại Old Trafford, Đại Manchester, Anh. Câu lạc bộ hiện đang chơi tại Giải bóng đá Ngoại hạng Anh, giải đấu hàng đầu trong hệ thống bóng đá Anh. Với biệt danh Quỷ Đỏ, câu lạc bộ được thành lập dưới tên Newton Heath LYR Football Club vào năm 1878, đổi tên thành Manchester United vào năm 1902 và chuyển đến sân vận động hiện tại, Old Trafford, vào năm 1910. Manchester United là một trong những câu lạc bộ thành công nhất tại Anh, giữ kỷ lục 20 lần vô địch bóng đá Anh, đoạt 12 Cúp FA, 5 Cúp Liên đoàn và giữ kỷ lục 21 lần đoạt Siêu cúp Anh. Câu lạc bộ đã giành được 3 Cúp C1 châu Âu/UEFA Champions League, 1 UEFA Cup Winners' Cup, 1 UEFA Europa league, 1 Siêu cúp châu Âu, 1 Cúp Liên lục địa và 1 FIFA Club World Cup. Trong mùa giải 1998–99, Manchester United trở thành đội bóng Anh đầu tiên và duy nhất giành cú ăn ba trong một mùa giải, gồm các chức vô địch Ngoại hạng Anh, cúp FA và UEFA Champions League.[4]";
    final String mc="Câu lạc bộ bóng đá Manchester City (tiếng Anh: Manchester City Football Club hay ngắn gọn là MCFC hay Man City) là một câu lạc bộ bóng đá chuyên nghiệp có trụ sở tại thành phố Manchester, nước Anh. Tính tới nay, Manchester City đã có 8 lần vô địch bóng đá Anh, 6 lần vô địch Cúp FA, 8 lần vô địch Cúp Liên đoàn bóng đá Anh, 6 lần vô địch Siêu cúp nước Anh và 1 lần đoạt Cúp C2 châu Âu.Sân nhà của câu lạc bộ là sân vận động Etihad, với sức chứa khoảng 55.000 khán giả. Biệt danh của câu lạc bộ là The Citizens (những người thành phố). Đối thủ truyền thống của Manchester City là câu lạc bộ Manchester United. Hiện nay, câu lạc bộ đang thi đấu tại giải bóng đá Ngoại hạng Anh. Năm 2019, Manchester City đã giành được bốn danh hiệu, hoàn thành việc vô địch tất cả các danh hiệu trong nước ở Anh và trở thành đội bóng Anh đầu tiên giành cú ăn ba trong nước.[4] Doanh thu của Manchester City đứng thứ năm trên thế giới trong mùa giải 2018-19 với giá 568,4 triệu euro. Cũng trong năm 2019, Forbes ước tính giá trị câu lạc bộ này ở mức 2,69 tỷ đô la Mỹ.";
    final String real="Real Madrid là Câu lạc bộ bóng đá xuất sắc nhất thế kỷ 20 của FIFA và được đánh giá là đội bóng vĩ đại nhất mọi thời đại.[6][7][8].Được thành lập vào ngày 6 tháng 3 năm 1902 với tên gọi Câu lạc bộ bóng đá Madrid, câu lạc bộ có truyền thống mặc bộ trang phục sân nhà màu trắng kể từ khi thành lập. Tước hiệu real trong tiếng Tây Ban Nha có nghĩa là hoàng gia được vua Alfonso XIII phong tặng cho câu lạc bộ vào năm 1920 cùng với vương miện hoàng gia trên huy hiệu. Câu lạc bộ đã chơi những trận đấu trên sân nhà tại Sân vận động Santiago Bernabéu có sức chứa 81.044 chỗ ngồi ở trung tâm thành phố Madrid kể từ năm 1947. Không giống như hầu hết các câu lạc bộ thể thao châu Âu khác, các thành viên của Real Madrid (socios) đã sở hữu và điều hành câu lạc bộ trong suốt quá trình hình thành và phát triển.";
    final String juven="Juventus Football Club (tiếng Latinh: iuventūs, phát âm tiếng Ý: [juˈvɛntus], tạm dịch: Tuổi trẻ), thường được gọi là Juventus hay Juve (phát âm [ˈjuːve])[3] là một câu lạc bộ bóng đá chuyên nghiệp của Ý có trụ sở tại Torino, Piemonte. Được thành lập vào năm 1897, câu lạc bộ thi đấu trong bộ trang phục sọc trắng đen từ năm 1903 và chơi các trận đấu trên sân nhà ở nhiều sân vận động khác nhau quanh thành phố, mới đây nhất là Sân vận động Juventus có sức chứa 41.507. Với biệt danh Vecchia Signora (Bà đầm già), câu lạc bộ đã giành được 36 danh hiệu Serie A, 14 danh hiệu Coppa Italia, 9 danh hiệu Supercoppa Italiana, 2 Intercontinental Cup, 2 UEFA Champions League, 1 UEFA Cup Winners' Cup, 3 UEFA Cup, 2 UEFA Super Cup và 1 UEFA Intertoto Cup[4][5].";
    final String liver="Câu lạc bộ bóng đá Liverpool (tiếng Anh: Liverpool Football Club) là một câu lạc bộ bóng đá chuyên nghiệp có trụ sở tại Liverpool, Anh, hiện đang thi đấu ở Premier League, giải đấu hàng đầu của hệ thống bóng đá Anh. Ở trong nước, câu lạc bộ đã giành được 19 chức vô địch Ngoại hạng Anh, 8 FA Cup, kỷ lục 9 League Cup và 16 FA Community Shield. Trong các giải đấu quốc tế, câu lạc bộ đã giành được sáu Cúp C1 Châu Âu, nhiều hơn bất kỳ một câu lạc bộ Anh nào khác, ba Cúp UEFA, bốn Siêu cúp UEFA và một FIFA Club World Cup.Liverpool được thành lập vào ngày 3 tháng 6 năm 1892 bởi John Houlding và lên chơi tại giải cấp quốc gia trong năm kế tiếp. Đội đã sử dụng sân nhà Anfield từ khi thành lập cho đến nay. Đội thi đấu rất thành công trong thập niên 70 và 80, dưới thời các huấn luyện viên Bill Shankly và Bob Paisley, họ đã giành được 11 chức vô địch quốc gia cùng 7 danh hiệu châu Âu.";
    final String bayen="Fußball-Club Bayern München e. V., còn được biết đến là FC Bayern , Bayern Munich hoặc đơn giản là Bayern,là một câu lạc bộ thể thao có trụ sở tại München, Đức.Câu lạc bộ này được biết đến nhiều nhất bởi đội bóng đá chuyên nghiệp đang chơi ở Bundesliga, hạng đấu cao nhất của hệ thống giải đấu bóng đá Đức, và là câu lạc bộ thành công nhất trong lịch sử bóng đá Đức, với 32 chức vô địch quốc gia và 20 cúp quốc gia, cùng với vô số danh hiệu châu Âu.[4]";
    final String chelsea ="là một câu lạc bộ bóng đá chuyên nghiệp của Anh có trụ sở tại Fulham, London. Được thành lập vào năm 1905, câu lạc bộ hiện đang thi đấu tại Premier League, giải đấu hàng đầu của bóng đá Anh. Chelsea là một trong những câu lạc bộ thành công nhất nước Anh, giành được hơn 30 danh hiệu, bao gồm 6 chức vô địch quốc gia và 7 danh hiệu châu Âu. Sân nhà của họ là Stamford Bridge.[5]";
    final String barca= "Thường được biết đến với tên gọi tắt Barcelona, hay đơn giản là Barça là một câu lạc bộ bóng đá giàu thành tích có trụ sở tại Barcelona, Catalunya, Tây Ban Nha. Barcelona được thành lập vào năm 1899 bởi một nhóm cầu thủ bóng đá người Thụy Sĩ, Anh và Catalunya, được dẫn dắt bởi Joan Gamper. Khẩu hiệu của Barcelona là Més que un club (Hơn cả một câu lạc bộ). Sân nhà của Barcelona là sân Nou Estadi del Futbol Club Barcelona (Sân mới của Câu lạc bộ bóng đá Barcelona), thường được gọi là Camp Nou.";
    final String tot= "Câu lạc bộ bóng đá Tottenham Hotspur (tiếng Anh: Tottenham Hotspur Football Club), thường được gọi là Tottenham Hotspur, Tottenham (/ˈtɒtənəm/)[2][3] hoặc Spurs, là một câu lạc bộ bóng đá chuyên nghiệp của Anh có trụ sở tại Luân Đôn, thủ đô Vương quốc Liên hiệp Anh và Bắc Ireland. Sân nhà của họ kể từ tháng 4 năm 2019 là Sân vận động Tottenham Hotspur thay thế cho White Hart Lane đã bị phá dỡ trước đó. Khu sân tập của họ nằm tại Bulls Cross, thuộc Khu Enfield của Luân Đôn. Tập đoàn ENIC là chủ sở hữu câu lạc bộ. Tottenham chọn màu áo trắng với quần xanh lam kể từ mùa giải 1898–99. Biểu tượng của đội bóng là hình chú gà trống đứng trên hình quả bóng, đi kèm với khẩu hiệu tiếng Latinh Audere est Facere (Dám nghĩ dám làm).";
    final String acMilan= "Associazione Calcio Milan S.p.A. Thường được biết đến với tên gọi tắt A.C. Milan, AC Milan hay đơn giản là Milan) là một câu lạc bộ bóng đá có trụ sở tại thành phố Milano, Ý được thành lập ngày 16 tháng 12 năm 1899[6]. Mùa giải 2021–22, đội bóng thi đấu ở các giải Serie A, Coppa Italia và UEFA Champions League.AC Milan là một trong những câu lạc bộ bóng đá thành công nhất thế giới. Ở đấu trường quốc tế, đội đã giành 18 danh hiệu bao gồm 4 Cúp Liên lục địa/Cúp thế giới các câu lạc bộ, 5 Siêu cúp châu Âu, 7 Cúp C1/UEFA Champions League và 2 UEFA Cup Winners'Cup.[7] Còn ở các giải đấu quốc nội, câu lạc bộ từng đoạt 19 danh hiệu vô địch quốc gia (Scudetto), 5 Cúp quốc gia và 7 Siêu cúp quốc gia.";
    final String interML= "Football Club Internazionale Milano , thường được biết đến với tên gọi tắt Internazionale, Inter Milan hay đơn giản là Inter, là một câu lạc bộ bóng đá Ý có trụ sở tại Milano, Lombardia, được thành lập ngày 9 tháng 3 năm 1908. Inter là câu lạc bộ duy nhất tham dự đủ các mùa giải Serie A, hạng đấu cao nhất của Giải vô địch bóng đá Ý từ năm 1929 và chưa bao giờ phải xuống chơi ở Serie B. Phòng truyền thống của đội bao gồm với 19 danh hiệu vô địch quốc gia (Scudetto), 7 Cúp quốc gia và 5 Siêu cúp quốc gia. Ở đấu trường quốc tế, Inter cũng sở hữu 9 danh hiệu với 3 chức vô địch Cúp C1 châu Âu/UEFA Champions League, 3 Cúp UEFA/Europa League cùng 3 Cúp Liên lục địa/Cúp thế giới các câu lạc bộ.";
    final String alettico= "Club Atlético de Madrid, thường được biết đến với cái tên Atlético Madrid, hay đơn giản là Atlético, là một câu lạc bộ bóng đá chuyên nghiệp Tây Ban Nha có trụ sở tại Madrid, chơi tại La Liga. Về phần các danh hiệu thi đấu của UEFA, Atlético Madrid là câu lạc bộ thành công thứ ba của Tây Ban Nha sau Real Madrid và Barcelona. Về số lượng các danh hiệu, Atlético Madrid là câu lạc bộ thành công thứ tư trong bóng đá Tây Ban Nha, sau Barcelona, ​​Real Madrid và Athletic Bilbao. Atlético đã vô địch La Liga 11 lần, trong đó có cú đúp quốc nội vào năm 1996; Copa del Rey mười lần; Hai Supercopas de España và một Copa Eva Duarte; Ở bình diện quốc tế, họ giành chức vô địch Cúp C2 Châu Âu vào năm 1962,về nhì năm 1963 và 1986.";
    final String dortmun= "BV Borussia Dortmund là một câu lạc bộ thể thao đóng ở Dortmund, phía bắc sông Rhine và được biết đến như một trong những đội bóng nổi tiếng và thành công nhất nước Đức cùng với Bayern Munich, Hamburg SV và Borussia Mönchengladbach. Với 8 chiếc cúp vô địch quốc gia Đức và 5 cúp DFB Pokal, Dortmund cũng vô địch UEFA Cup Winners' Cup vào năm 1966 (trở thành đội bóng Đức đầu tiên giành danh hiệu tầm châu lục) và giành chức vô địch UEFA Champions League vào năm 1997.";

    private GridView gridView;
    private TextView txtTitle;
    private DoiBongAdapterHome doiBongAdapter;
    private ArrayList<DoiBong1> doiBongArrayList;
    private List<DoiBong1> doiBongImgArrayList;
    private Button btnChoiNgay;
    private ViewPager viewPager;
    private CircleIndicator indicator;
    private Handler handler= new Handler();
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            if(viewPager.getCurrentItem()==doiBongImgArrayList.size()-1){
                viewPager.setCurrentItem(0);
            }else{
                viewPager.setCurrentItem(viewPager.getCurrentItem()+1);
            }
        }
    };

    @Override
    public void onPause() {
        super.onPause();
        handler.removeCallbacks(runnable);
    }

    @Override
    public void onResume() {
        handler.postDelayed(runnable,3000);
        super.onResume();
    }

    public List<DoiBong1> getListDoiBong(){
        List<DoiBong1> list = new ArrayList<>();
        list.add(new DoiBong1(R.drawable.anhdoimu));
        list.add(new DoiBong1(R.drawable.anhdoichealse));
        list.add(new DoiBong1(R.drawable.anhdoipsg));
        list.add(new DoiBong1(R.drawable.anhdoimc));
        list.add(new DoiBong1(R.drawable.anhdoidortmunt));
        list.add(new DoiBong1(R.drawable.anhdoijuventus));
        list.add(new DoiBong1(R.drawable.anhdoiatletico));
        list.add(new DoiBong1(R.drawable.anhdoibayen));
        return list;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trang_chu, container, false);
        btnChoiNgay = (Button) view.findViewById(R.id.btnChoiNgay);
        viewPager =(ViewPager) view.findViewById(R.id.avt);
        indicator=(CircleIndicator) view.findViewById(R.id.circle) ;
        doiBongImgArrayList=getListDoiBong();
        DoiBongViewPagerAdapter adapter = new DoiBongViewPagerAdapter(doiBongImgArrayList);
        viewPager.setAdapter(adapter);
        indicator.setViewPager(viewPager);
        handler.postDelayed(runnable,3000);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable,3000);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        txtTitle =(TextView) view.findViewById(R.id.txtTitle);
        txtTitle.setText("NGUYENVANTHO.VN");
        gridView = (GridView) view.findViewById(R.id.grView);
        doiBongArrayList = new ArrayList<>();
        doiBongArrayList.add(new DoiBong1("Sân vận động Santiago Bernabéu",real,"Real Madrid",R.drawable.anhdoireal,"Những chú kền kền trắng"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Allianz",bayen,"Bayern Munich",R.drawable.anhdoibayen,"Những chiến binh hùm xám"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Công viên các Hoàng tử",psg,"Paris Saint Germain",R.drawable.anhdoipsg,"Những người dân Paris"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Anfield",liver,"Liverpool",R.drawable.anhdoiliver,"Liverpudlians những người dân bản địa"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Stamford Bridge",chelsea,"Chelsea",R.drawable.anhdoichealse,"Những chàng trai thích màu xanh The Blues"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Old Trafford",mu,"Manchester United",R.drawable.anhdoimu,"Quỷ đỏ thành LonDon"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Etihad",mc,"Manchester City",R.drawable.anhdoimc,"Những con người thành phố"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Camp Nou",barca,"Barcelona",R.drawable.anhdoibarca,"Đại gia đình Cules"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Santiago Bernabéu",real,"Real Madrid",R.drawable.anhdoireal,"Những chú kền kền trắng"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Juventus",juven,"Juventus",R.drawable.anhdoijuventus,"Những chú ngựa vằn"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Allianz",bayen,"Bayern Munich",R.drawable.anhdoibayen,"Những chiến binh hùm xám"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Công viên các Hoàng tử",psg,"Paris Saint Germain",R.drawable.anhdoipsg,"Những người dân Paris"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Westfalenstadion",dortmun,"Borussia Dortmund",R.drawable.anhdoidortmunt,"Die Borussen (những người Phổ)"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Giuseppe Meazza",acMilan,"AC Milan",R.drawable.anhdoiacmilan,"Quỷ đỏ đen"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Giuseppe Meazza",interML,"Inter Milan",R.drawable.anhdoiintermilan,"Internazionale"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Tottenham Hotspur",tot,"Tottenham Hotspur",R.drawable.anhdoitottenham,"Vườn hoa Loa Kèn"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Giuseppe Meazza",alettico,"Atletico Madrid",R.drawable.anhdoiatletico,"Los Rojiblancos (Đỏ và trắng)"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Anfield",liver,"Liverpool",R.drawable.anhdoiliver,"Liverpudlians những người dân bản địa"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Stamford Bridge",chelsea,"Chelsea",R.drawable.anhdoichealse,"Những chàng trai thích màu xanh The Blues"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Old Trafford",mu,"Manchester United",R.drawable.anhdoimu,"Quỷ đỏ thành LonDon"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Etihad",mc,"Manchester City",R.drawable.anhdoimc,"Những con người thành phố"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Camp Nou",barca,"Barcelona",R.drawable.anhdoibarca,"Đại gia đình Cules"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Juventus",juven,"Juventus",R.drawable.anhdoijuventus,"Những chú ngựa vằn"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Santiago Bernabéu",real,"Real Madrid",R.drawable.anhdoireal,"Những chú kền kền trắng"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Công viên các Hoàng tử",psg,"Paris Saint Germain",R.drawable.anhdoipsg,"Những người dân Paris"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Westfalenstadion",dortmun,"Borussia Dortmund",R.drawable.anhdoidortmunt,"Die Borussen (những người Phổ)"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Giuseppe Meazza",acMilan,"AC Milan",R.drawable.anhdoiacmilan,"Quỷ đỏ đen"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Giuseppe Meazza",interML,"Inter Milan",R.drawable.anhdoiintermilan,"Internazionale"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Tottenham Hotspur",tot,"Tottenham Hotspur",R.drawable.anhdoitottenham,"Vườn hoa Loa Kèn"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Giuseppe Meazza",alettico,"Atletico Madrid",R.drawable.anhdoiatletico,"Los Rojiblancos (Đỏ và trắng)"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Anfield",liver,"Liverpool",R.drawable.anhdoiliver,"Liverpudlians những người dân bản địa"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Stamford Bridge",chelsea,"Chelsea",R.drawable.anhdoichealse,"Những chàng trai thích màu xanh The Blues"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Old Trafford",mu,"Manchester United",R.drawable.anhdoimu,"Quỷ đỏ thành LonDon"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Allianz",bayen,"Bayern Munich",R.drawable.anhdoibayen,"Những chiến binh hùm xám"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Etihad",mc,"Manchester City",R.drawable.anhdoimc,"Những con người thành phố"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Camp Nou",barca,"Barcelona",R.drawable.anhdoibarca,"Đại gia đình Cules"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Juventus",juven,"Juventus",R.drawable.anhdoijuventus,"Những chú ngựa vằn"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Westfalenstadion",dortmun,"Borussia Dortmund",R.drawable.anhdoidortmunt,"Die Borussen (những người Phổ)"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Tottenham Hotspur",tot,"Tottenham Hotspur",R.drawable.anhdoitottenham,"Vườn hoa Loa Kèn"));
        doiBongArrayList.add(new DoiBong1("Sân vận động Giuseppe Meazza",acMilan,"AC Milan",R.drawable.anhdoiacmilan,"Quỷ đỏ đen"));

        doiBongAdapter= new DoiBongAdapterHome(getContext(),0,doiBongArrayList);
        gridView.setAdapter(doiBongAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(getContext(), MoTaDoiBong.class);
                    intent.putExtra("key1",doiBongArrayList.get(i).getImg());
                    intent.putExtra("key2",doiBongArrayList.get(i).getTenDoiBong());
                    intent.putExtra("key3",doiBongArrayList.get(i).getMoTaChiTiet());
                    intent.putExtra("key4",doiBongArrayList.get(i).getMoTa());
                    intent.putExtra("key5",doiBongArrayList.get(i).getSanVanDong());
                    startActivity(intent);
            }
        });
        return view;
    }
}