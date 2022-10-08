package com.example.bt_giuaky;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TrangChuFragment extends Fragment {
    ListView lvDoiBong;
    List<list_Doi_Bong> arrayDoiBong;
    DoiBongAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_trang_chu_fragment,container,false);
        lvDoiBong = (ListView) view.findViewById(R.id.listviewTraiCay);
        Danhsach();
        adapter = new DoiBongAdapter(getContext(), R.layout.dong_doi_bong, arrayDoiBong);
        lvDoiBong.setAdapter(adapter);
        lvDoiBong.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(),MoTaDoiBongPsgActivity.class);
                intent.putExtra("key1",arrayDoiBong.get(i).getTen());
                intent.putExtra("key2",arrayDoiBong.get(i).getMoTaChiTiet());
                intent.putExtra("key3",arrayDoiBong.get(i).getHinh());
                intent.putExtra("key4",arrayDoiBong.get(i).getTenSVD());
                intent.putExtra("key5",arrayDoiBong.get(i).getTenHLV());
                intent.putExtra("key6",arrayDoiBong.get(i).getAnhChiTiet());
                startActivity(intent);
            }
        });
        return view;
//
    }

    private void Danhsach() {
        arrayDoiBong = new ArrayList<>();
        arrayDoiBong.add(new list_Doi_Bong("Bayern Munich", "Những chiến binh hùm xám", R.drawable.bayern,"Sân vận động Allianz","Huấn luyện viên Julian Nagelsmann","Fußball-Club Bayern München e. V., còn được biết đến là FC Bayern , Bayern Munich hoặc đơn giản là Bayern,\n" +
                "            là một câu lạc bộ thể thao có trụ sở tại München, Đức.\n" +
                "            Câu lạc bộ này được biết đến nhiều nhất bởi đội bóng đá chuyên nghiệp đang chơi ở Bundesliga, hạng đấu cao nhất của hệ thống giải đấu bóng đá Đức, và là câu lạc bộ thành công nhất trong lịch sử bóng đá Đức, với 32 chức vô địch quốc gia và 20 cúp quốc gia, cùng với vô số danh hiệu châu Âu.[4]\n",R.drawable.anhdoibayen));
        arrayDoiBong.add(new list_Doi_Bong("Juventus", "Những chú ngựa vằn", R.drawable.juven,"Sân vận động Juventus","Huấn luyện viện Massimiliano Allegri","Juventus Football Club (tiếng Latinh: iuventūs, phát âm tiếng Ý: [juˈvɛntus], tạm dịch: Tuổi trẻ), thường được gọi là Juventus hay Juve (phát âm [ˈjuːve])[3] là một câu lạc bộ bóng đá chuyên nghiệp của Ý có trụ sở tại Torino, Piemonte. Được thành lập vào năm 1897, câu lạc bộ thi đấu trong bộ trang phục sọc trắng đen từ năm 1903 và chơi các trận đấu trên sân nhà ở nhiều sân vận động khác nhau quanh thành phố, mới đây nhất là Sân vận động Juventus có sức chứa 41.507. Với biệt danh Vecchia Signora (Bà đầm già), câu lạc bộ đã giành được 36 danh hiệu Serie A, 14 danh hiệu Coppa Italia, 9 danh hiệu Supercoppa Italiana, 2 Intercontinental Cup, 2 UEFA Champions League, 1 UEFA Cup Winners' Cup, 3 UEFA Cup, 2 UEFA Super Cup và 1 UEFA Intertoto Cup[4][5].",R.drawable.anhdoijuventus));
        arrayDoiBong.add(new list_Doi_Bong("Liverpool", "Liverpudlians những người dân bản địa", R.drawable.liver,"Sân vận động Anfield","Huấn luyện viên Jürgen Klopp","Câu lạc bộ bóng đá Liverpool (tiếng Anh: Liverpool Football Club) là một câu lạc bộ bóng đá chuyên nghiệp có trụ sở tại Liverpool, Anh, hiện đang thi đấu ở Premier League, giải đấu hàng đầu của hệ thống bóng đá Anh. Ở trong nước, câu lạc bộ đã giành được 19 chức vô địch Ngoại hạng Anh, 8 FA Cup, kỷ lục 9 League Cup và 16 FA Community Shield. Trong các giải đấu quốc tế, câu lạc bộ đã giành được sáu Cúp C1 Châu Âu, nhiều hơn bất kỳ một câu lạc bộ Anh nào khác, ba Cúp UEFA, bốn Siêu cúp UEFA và một FIFA Club World Cup.\n" +
                "\n" +
                "Liverpool được thành lập vào ngày 3 tháng 6 năm 1892 bởi John Houlding và lên chơi tại giải cấp quốc gia trong năm kế tiếp. Đội đã sử dụng sân nhà Anfield từ khi thành lập cho đến nay. Đội thi đấu rất thành công trong thập niên 70 và 80, dưới thời các huấn luyện viên Bill Shankly và Bob Paisley, họ đã giành được 11 chức vô địch quốc gia cùng 7 danh hiệu châu Âu.",R.drawable.anhdoijuventus));
        arrayDoiBong.add(new list_Doi_Bong("Barcelona", "Đại gia đình Cules", R.drawable.iconbarca,"Sân vận động Camp Nou","Huấn luyện viên Xavi","Thường được biết đến với tên gọi tắt Barcelona, hay đơn giản là Barça là một câu lạc bộ bóng đá giàu thành tích có trụ sở tại Barcelona, Catalunya, Tây Ban Nha. Barcelona được thành lập vào năm 1899 bởi một nhóm cầu thủ bóng đá người Thụy Sĩ, Anh và Catalunya, được dẫn dắt bởi Joan Gamper. Khẩu hiệu của Barcelona là Més que un club (Hơn cả một câu lạc bộ). Sân nhà của Barcelona là sân Nou Estadi del Futbol Club Barcelona (Sân mới của Câu lạc bộ bóng đá Barcelona), thường được gọi là Camp Nou.",R.drawable.anhdoibarca));
        arrayDoiBong.add(new list_Doi_Bong("Real Madrid", "Những chú kền kền trắng ", R.drawable.real,"Sân vận động Santiago Bernabéu","Huấn luyện viên Carlo Ancelotti","Real Madrid là Câu lạc bộ bóng đá xuất sắc nhất thế kỷ 20 của FIFA và được đánh giá là đội bóng vĩ đại nhất mọi thời đại.[6][7][8]\n" +
                "\n" +
                "Được thành lập vào ngày 6 tháng 3 năm 1902 với tên gọi Câu lạc bộ bóng đá Madrid, câu lạc bộ có truyền thống mặc bộ trang phục sân nhà màu trắng kể từ khi thành lập. Tước hiệu real trong tiếng Tây Ban Nha có nghĩa là hoàng gia được vua Alfonso XIII phong tặng cho câu lạc bộ vào năm 1920 cùng với vương miện hoàng gia trên huy hiệu. Câu lạc bộ đã chơi những trận đấu trên sân nhà tại Sân vận động Santiago Bernabéu có sức chứa 81.044 chỗ ngồi ở trung tâm thành phố Madrid kể từ năm 1947. Không giống như hầu hết các câu lạc bộ thể thao châu Âu khác, các thành viên của Real Madrid (socios) đã sở hữu và điều hành câu lạc bộ trong suốt quá trình hình thành và phát triển.",R.drawable.anhdoireal));
        arrayDoiBong.add(new list_Doi_Bong("Paris Saint Germain", "Những người dân Paris", R.drawable.psg,"Sân vận động Công viên các Hoàng tử","Huấn luyện viên Christophe Galtier","Câu lạc bộ bóng đá Paris Saint-Germain (thường được gọi là Paris Saint-Germain, Paris SG hoặc đơn giản là PSG) là một câu lạc bộ bóng đá chuyên nghiệp có trụ sở tại Paris, Pháp. Tiền thân là câu lạc bộ đa thể thao Stade Saint-Germain, Paris Saint-Germain chính thức được thành lập năm 1970 và hiện đang thi đấu tại Ligue 1.Tại hạng đấu cao nhất của bóng đá Pháp, Paris Saint-Germain có 10 lần giành chức vô địch của giải đấu. Câu lạc bộ cũng có 9 lần giữ vị trí á quân, trong đó có mùa bóng 1992–1993, Paris Saint-Germain từ chối chức vô địch sau khi Olympique de Marseille bị tước danh hiệu vì scandal. Với các giải đá cúp, câu lạc bộ có rất nhiều thành tích với 14 lần giành Cúp bóng đá Pháp, 9 lần giành Cúp Liên đoàn bóng đá Pháp và 10 lần Siêu cúp bóng đá Pháp. Trên đấu trường châu Âu, thành tích lớn nhất mà Paris Saint-Germain đạt được là danh hiệu UEFA Cup Winners' Cup vào năm 1996 và 1 lần về nhì ở UEFA Champions League. Trang phục thi đấu của Paris Saint-Germain mang hai màu xanh, đỏ chủ đạo, cũng chính là màu cờ của thành phố Paris. Sân nhà của câu lạc bộ hiện tại là Sân vận động Công viên các Hoàng tử, nằm tại Quận 16, kế bên rừng Boulogne, có sức chứa 47.929 chỗ ngồi.",R.drawable.anhdoipsg));
        arrayDoiBong.add(new list_Doi_Bong("Manchester City", "Những con người thành phố", R.drawable.mc,"sân vận động Etihad","Huấn luyện viên Pep Guardiola","Câu lạc bộ bóng đá Manchester City (tiếng Anh: Manchester City Football Club hay ngắn gọn là MCFC hay Man City) là một câu lạc bộ bóng đá chuyên nghiệp có trụ sở tại thành phố Manchester, nước Anh. Tính tới nay, Manchester City đã có 8 lần vô địch bóng đá Anh, 6 lần vô địch Cúp FA, 8 lần vô địch Cúp Liên đoàn bóng đá Anh, 6 lần vô địch Siêu cúp nước Anh và 1 lần đoạt Cúp C2 châu Âu.\n" +
                "\n" +
                "Sân nhà của câu lạc bộ là sân vận động Etihad, với sức chứa khoảng 55.000 khán giả. Biệt danh của câu lạc bộ là The Citizens (những người thành phố). Đối thủ truyền thống của Manchester City là câu lạc bộ Manchester United. Hiện nay, câu lạc bộ đang thi đấu tại giải bóng đá Ngoại hạng Anh.\n" +
                "\n" +
                "Năm 2019, Manchester City đã giành được bốn danh hiệu, hoàn thành việc vô địch tất cả các danh hiệu trong nước ở Anh và trở thành đội bóng Anh đầu tiên giành cú ăn ba trong nước.[4] Doanh thu của Manchester City đứng thứ năm trên thế giới trong mùa giải 2018-19 với giá 568,4 triệu euro. Cũng trong năm 2019, Forbes ước tính giá trị câu lạc bộ này ở mức 2,69 tỷ đô la Mỹ.",R.drawable.anhdoimc));
        arrayDoiBong.add(new list_Doi_Bong("Manchester United", "Quỷ đỏ thành LonDon", R.drawable.mu,"Sân vận động Old Trafford","Huấn luyện viên Erik ten Hag","Câu lạc bộ bóng đá Manchester United (tiếng Anh: Manchester United Football Club, hay ngắn gọn là MU hay Man Utd) là một câu lạc bộ bóng đá chuyên nghiệp có trụ sở tại Old Trafford, Đại Manchester, Anh. Câu lạc bộ hiện đang chơi tại Giải bóng đá Ngoại hạng Anh, giải đấu hàng đầu trong hệ thống bóng đá Anh. Với biệt danh Quỷ Đỏ, câu lạc bộ được thành lập dưới tên Newton Heath LYR Football Club vào năm 1878, đổi tên thành Manchester United vào năm 1902 và chuyển đến sân vận động hiện tại, Old Trafford, vào năm 1910.\n" +
                "\n" +
                "Manchester United là một trong những câu lạc bộ thành công nhất tại Anh, giữ kỷ lục 20 lần vô địch bóng đá Anh, đoạt 12 Cúp FA, 5 Cúp Liên đoàn và giữ kỷ lục 21 lần đoạt Siêu cúp Anh. Câu lạc bộ đã giành được 3 Cúp C1 châu Âu/UEFA Champions League, 1 UEFA Cup Winners' Cup, 1 UEFA Europa league, 1 Siêu cúp châu Âu, 1 Cúp Liên lục địa và 1 FIFA Club World Cup. Trong mùa giải 1998–99, Manchester United trở thành đội bóng Anh đầu tiên và duy nhất giành cú ăn ba trong một mùa giải, gồm các chức vô địch Ngoại hạng Anh, cúp FA và UEFA Champions League.[4]",R.drawable.anhdoimu));
        arrayDoiBong.add(new list_Doi_Bong("Chelsea", "Những chàng trai thích màu xanh The Blues", R.drawable.chelsea,"Sân vận động Stamford Bridge","Huấn luyện viên Graham Potter","là một câu lạc bộ bóng đá chuyên nghiệp của Anh có trụ sở tại Fulham, London. Được thành lập vào năm 1905, câu lạc bộ hiện đang thi đấu tại Premier League, giải đấu hàng đầu của bóng đá Anh. Chelsea là một trong những câu lạc bộ thành công nhất nước Anh, giành được hơn 30 danh hiệu, bao gồm 6 chức vô địch quốc gia và 7 danh hiệu châu Âu. Sân nhà của họ là Stamford Bridge.[5]",R.drawable.anhdoichealse));

    }

}