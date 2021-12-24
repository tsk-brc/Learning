require './app/mission_c_077.rb'

describe 'レポート評価チェック' do
  describe '出力結果のテスト' do
    let(:missionC077) { MissionC077.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "3 25\n",
      "-2 17\n",
      "-7 20\n",
      "2 24\n"
      expect { missionC077.run }.to output("C\nA\nB\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "1 50\n", "10 49\n"
      expect { missionC077.run }.to output("D\n").to_stdout
    end
  end
end
