require './app/mission_c_095_2.rb'

describe 'バス到着時刻チェック' do
  describe '出力結果のテスト' do
    let(:missionC095) { MissionC095_2.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "5 5\n", "2\n", "1\n", "7\n", "3\n", "10\n"
      expect { missionC095.run }.to output("3\n7\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "2 3\n", "3\n", "1\n"
      expect { missionC095.run }.to output("3\n").to_stdout
    end
  end
end
