require './app/mission_d_200.rb'

describe '電気料金算出チェック' do
  describe '出力結果のテスト' do
    let(:missionD200) { MissionD200.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "3\n"
      expect { missionD200.run }.to output("1800\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "1\n"
      expect { missionD200.run }.to output("600\n").to_stdout
    end
  end
end
