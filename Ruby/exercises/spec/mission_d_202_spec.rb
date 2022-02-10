require './app/mission_d_202.rb'

describe '価格チェック' do
  describe '出力結果のテスト' do
    let(:missionD202) { MissionD202.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "2000 250\n", "2100 100\n"
      expect { missionD202.run }.to output("2200\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "10000 0\n", "10000 1000\n"
      expect { missionD202.run }.to output("10000\n").to_stdout
    end
  end
end
